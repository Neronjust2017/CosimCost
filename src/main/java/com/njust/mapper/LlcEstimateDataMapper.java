package com.njust.mapper;

import com.njust.model.LlcEstimateData;
import com.njust.model.LlcEstimateDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcEstimateDataMapper {
    long countByExample(LlcEstimateDataExample example);

    int deleteByExample(LlcEstimateDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LlcEstimateData record);

    int insertSelective(LlcEstimateData record);

    List<LlcEstimateData> selectByExample(LlcEstimateDataExample example);

    LlcEstimateData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LlcEstimateData record, @Param("example") LlcEstimateDataExample example);

    int updateByExample(@Param("record") LlcEstimateData record, @Param("example") LlcEstimateDataExample example);

    int updateByPrimaryKeySelective(LlcEstimateData record);

    int updateByPrimaryKey(LlcEstimateData record);
}