package com.njust.mapper;

import com.njust.model.LlcCost;
import com.njust.model.LlcCostExample;
import com.njust.model.LlcCostKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcCostMapper {
    long countByExample(LlcCostExample example);

    int deleteByExample(LlcCostExample example);

    int deleteByPrimaryKey(LlcCostKey key);

    int insert(LlcCost record);

    int insertSelective(LlcCost record);

    List<LlcCost> selectByExample(LlcCostExample example);

    LlcCost selectByPrimaryKey(LlcCostKey key);

    int updateByExampleSelective(@Param("record") LlcCost record, @Param("example") LlcCostExample example);

    int updateByExample(@Param("record") LlcCost record, @Param("example") LlcCostExample example);

    int updateByPrimaryKeySelective(LlcCost record);

    int updateByPrimaryKey(LlcCost record);
}