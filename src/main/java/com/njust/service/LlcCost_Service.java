package com.njust.service;

import com.njust.model.LlcCost;
import com.njust.model.LlcCostExample;
import com.njust.model.LlcCostKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LlcCost_Service {

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
