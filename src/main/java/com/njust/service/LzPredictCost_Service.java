package com.njust.service;

import com.njust.model.LzPredictCost;
import com.njust.model.LzPredictCostExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LzPredictCost_Service {

    long countByExample(LzPredictCostExample example);

    int deleteByExample(LzPredictCostExample example);

    int insert(LzPredictCost record);

    int insertSelective(LzPredictCost record);

    List<LzPredictCost> selectByExample(LzPredictCostExample example);

    int updateByExampleSelective(@Param("record") LzPredictCost record, @Param("example") LzPredictCostExample example);

    int updateByExample(@Param("record") LzPredictCost record, @Param("example") LzPredictCostExample example);
}
