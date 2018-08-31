package com.njust.service.serviceImpl;

import com.njust.model.LzPredictCost;
import com.njust.model.LzPredictCostExample;
import com.njust.mapper.LzPredictCostMapper;
import com.njust.service.LzPredictCost_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LzPredictCost_ServiceImpl implements LzPredictCost_Service {
    @Autowired
    LzPredictCostMapper LzPredictCostMapper;

    public long countByExample(LzPredictCostExample example) {
        return LzPredictCostMapper.countByExample(example);
    }

    public int deleteByExample(LzPredictCostExample example) {
        return LzPredictCostMapper.deleteByExample(example);
    }

    public int insert(LzPredictCost record) {
        return LzPredictCostMapper.insert(record);
    }

    public int insertSelective(LzPredictCost record) {
        return LzPredictCostMapper.insertSelective(record);
    }

    public List<LzPredictCost> selectByExample(LzPredictCostExample example) {
        return LzPredictCostMapper.selectByExample(example);
    }

    public int updateByExampleSelective(@Param("record") LzPredictCost record, @Param("example") LzPredictCostExample example) {
        return LzPredictCostMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LzPredictCost record, @Param("example") LzPredictCostExample example) {
        return LzPredictCostMapper.updateByExample(record, example);
    }
}
