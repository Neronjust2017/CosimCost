package com.njust.controller;

import com.njust.model.*;
import com.njust.service.*;
import com.njust.utils.Variable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Convert;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class controller {

    @Autowired
    LlcScheme_Service llcScheme_service;
    LlcCost_Service llcCost_service;
    LzPredictCost_Service lzPredictCost_service;
    LlcSchemeCostDimension_Service llcSchemeCostDimension_service;
    LlcSchemeParaDimension_Service llcSchemeParaDimension_service;
    LlcProduct_Service llcProduct_service;
    LlcTime_Service llcTime_service;
    LlcTechnology_Service llcTechnology_service;
    LlcTask_Service llcTask_service;
    LlcResource_Service llcResource_service;
    LlcParameter_Service llcParameter_service;



    @RequestMapping("/cost")
    public List<LlcCost> GetAllCostValueList(int scheme_id, boolean sensitive)
    {
        List<LlcCost> listCost = Calculate(scheme_id,sensitive);



        return ; //
    }



    public  List<LlcCost> Calculate(int scheme_id, boolean sensitive)//计算所有原子费用的值------lz修b改
    {

        int cost_tree_id =llcScheme_service.selectByPrimaryKey(scheme_id).getCostTreeId();//找到方案的费用树id

        List<LlcCost> listCost = new ArrayList<LlcCost>();//存放计算的费用值
        //通过费用树id，从COST表里找到费用树下的原子费用项
        LlcCostExample example=new LlcCostExample();
        LlcCostExample.Criteria criteria = example.createCriteria();
        criteria.andCostTreeIdEqualTo(cost_tree_id);
        criteria.andIsatomEqualTo(1.0);
        List<LlcCost> costAtom =llcCost_service.selectByExample(example);//获取用于计算的原子费用及其计算公式
        if (costAtom.size()> 0)
        {
            for (LlcCost dr : costAtom)
            {
                BigDecimal value=BigDecimal.valueOf(12);
                LzPredictCostExample example1=new LzPredictCostExample();
                LzPredictCostExample.Criteria criteria1=example1.createCriteria();
                criteria1.andCostTreeIdEqualTo(BigDecimal.valueOf(cost_tree_id));
                criteria1.andCostIdEqualTo(BigDecimal.valueOf(dr.getCostTreeId()));
                long recordNumber=lzPredictCost_service.countByExample(example1);
                //判断费用模式 已知还是未知
                if (recordNumber == 0)//没有对应记录ExecuteSql就返回-1
                {
                    value = GetCostValue(scheme_id, dr, sensitive);   //已知 计算方式
                }//////////// 未知
                else if (recordNumber == 1)
                {
                LzPredictCostExample example2 =new LzPredictCostExample();
                LzPredictCostExample.Criteria criteria2=example2.createCriteria();
                criteria2.andCostTreeIdEqualTo(BigDecimal.valueOf(dr.getCostTreeId()));
                criteria2.andCostIdEqualTo(BigDecimal.valueOf(dr.getCostId()));
                    value = lzPredictCost_service.selectByExample(example2).get(0).getPredictCost();
                }
                else if (recordNumber == 2)
                {
                    LzPredictCostExample example3 =new LzPredictCostExample();
                    LzPredictCostExample.Criteria criteria3=example3.createCriteria();
                    criteria3.andCostTreeIdEqualTo(BigDecimal.valueOf(dr.getCostTreeId()));
                    criteria3.andCostIdEqualTo(BigDecimal.valueOf(dr.getCostId()));
                    criteria3.andTrainMethodEqualTo(1);
                    value = lzPredictCost_service.selectByExample(example3).get(0).getPredictCost();
                }
                /////////////
                listCost.add(new LlcCost(dr.get(),dr.getCOST_ID(),Convert.value)); //返回listCost，{ID，NAME,value}
            }
        }
        return listCost;
    }





    private  double GetCostValue(int scheme_id, LlcCost dr, boolean sensitive)//计算单个原子费用的值
    {
        double costValue = 0;

        //获取原子费用维度信息
        Map<String, Integer> dic_dim = new HashMap<String, Integer>();
        LlcSchemeCostDimension llcSchemeCostDimension=llcSchemeCostDimension_service.findDimensionByCost_id(scheme_id,dr.getCostId());   //通过方案下原子费用项，找到原子费用对应的维度
        dic_dim.put("BELONG_PRODUCT_ID",llcSchemeCostDimension.getBelongProductId());//产品
        dic_dim.put("BELONG_TASK_ID", llcSchemeCostDimension.getBelongTaskId());   //任务
        dic_dim.put("BELONG_RESOURCE_ID",llcSchemeCostDimension.getBelongResourceId());  //资源
        dic_dim.put("BELONG_TIME_ID", llcSchemeCostDimension.getBelongTimeId()); //时间
        dic_dim.put("BELONG_TECHNOLOGY_ID", llcSchemeCostDimension.getBelongTechnologyId()); //技术

        String strFunVars = "1,2,";//加入技术成熟度模型  1,2为预先定义
        strFunVars += dr.getVariables();//变量ID
        List<Variable> listVar = new ArrayList<Variable>();
        if (strFunVars != "")
        {
            String[] funVars = strFunVars.split(",");//函数表达式所包含的变量集合
            for(String var : funVars)//对于每一个变量
            {
                int  variable=Integer.parseInt(var);
                double variableValue = GetVariableValue(variable, dic_dim, scheme_id, sensitive);  //在不同维度下，得到变量的值 GetVariableValue(variable：变量id, dic_dim：各维度,scheme_id,sensitive)

                String variableName =llcParameter_service.//得到变量名
                listVar.Add(new Variable(variableName, variableValue));
            }
        }
        try
        {
            JepInstance jep = new JepInstance();
            for (int i = 0; i < listVar.Count; i++)
            {
                jep.VarTab.AddVariable(listVar[i].Name, new JepDouble(listVar[i].Value));
            }
            String exp = "a*ln(x)+";
            exp += dr["FUNCTION"].ToString();
            jep.Parse(exp);
            costValue = jep.EvaluateD();
        }
        catch (Exception ex)
        { }
        return costValue;
    }



    private double GetVariableValue(int variable, Map<String,Integer> dic_dim,int scheme_id,boolean sensitive)//得到作为变量的参数的值
    {
        double variableValue;
        double factor = 1;
        int proid = dic_dim.get("BELONG_PRODUCT_ID");
        int taskid = dic_dim.get("BELONG_TASK_ID");
        int resid = dic_dim.get("BELONG_RESOURCE_ID");
        int timeid = dic_dim.get("BELONG_TIME_ID");
        int techid = dic_dim.get("BELONG_TECHNOLOGY_ID");

        LlcSchemeParaDimension llcSchemeParaDimension=llcSchemeParaDimension_service.findDimensionByDimension(scheme_id,variable,proid,taskid,resid,timeid,techid);

        if (llcSchemeParaDimension==null)//条件成立表示在该维度下参数没有设置值，接下来就转向寻找维度最高级所对应的的值，还没有就直接采用参数默认值
        {
            LlcScheme llcScheme = llcScheme_service.findByscheme_id(scheme_id);//通过方案id获取方案配置信息
            int PRODUCT_TREE_ID = llcScheme.getPRODUCT_TREE_ID(); //获取产品树id
            int TASK_TREE_ID = llcScheme.getTASK_TREE_ID();        //获取任务树id
            int RESOURCE_TREE_ID = llcScheme.getRESOURCE_TREE_ID(); //获取资源树id
            int TIME_TREE_ID = llcScheme.getTIME_TREE_ID(); ;        //获取时间树id
            int TECHNOLOGY_TREE_ID = llcScheme.getTECHNOLOGY_TREE_ID(); //获取技术树id

            proid = llcProduct_service.selectProduct_rootid(PRODUCT_TREE_ID);//获取产品根节点ID
            taskid =llcTask_service.selectTask_rootid(TASK_TREE_ID);         //获取任务根节点ID
            resid = llcResource_service.selectResource_rootid(RESOURCE_TREE_ID);     //获取资源根节点ID
            timeid = 0;
            techid = llcTechnology_service.selectTechnology_rootid(TECHNOLOGY_TREE_ID);

            LlcSchemeParaDimension llcSchemeParaDimension2=llcSchemeParaDimension_service.findDimensionByDimension(scheme_id,variable,proid,taskid,resid,timeid,techid);
            if (llcSchemeParaDimension2 ==null) //寻找维度最高级所对应的的值，还没有就直接采用参数默认值
            {
                variableValue =llcParameter_service.selectDefault_value(variable);   //寻找参数默认值

                if (sensitive)
                {
                    factor = llcParameter_service.selectSensitivity(variable);
                }
                variableValue = variableValue * factor;
                return variableValue;
            }
            variableValue = CalculateVariableValue(par2, sensitive); //寻找维度最高级所对应的的值，有的情况
            return variableValue;
        }
        variableValue = CalculateVariableValue(par,sensitive); //在该维度下参数有设置值
        return variableValue;
    }

    @RequestMapping("/user")
    public class 获得














































}