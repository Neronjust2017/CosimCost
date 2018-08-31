package com.njust.mapper;

import com.njust.model.LzPredictCost;
import com.njust.model.LzPredictCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzPredictCostMapper {
    long countByExample(LzPredictCostExample example);

    int deleteByExample(LzPredictCostExample example);

    int insert(LzPredictCost record);

    int insertSelective(LzPredictCost record);

    List<LzPredictCost> selectByExample(LzPredictCostExample example);

    int updateByExampleSelective(@Param("record") LzPredictCost record, @Param("example") LzPredictCostExample example);

    int updateByExample(@Param("record") LzPredictCost record, @Param("example") LzPredictCostExample example);

}