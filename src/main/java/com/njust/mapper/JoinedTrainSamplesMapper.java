package com.njust.mapper;

import com.njust.model.JoinedTrainSamples;
import com.njust.model.JoinedTrainSamplesExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoinedTrainSamplesMapper {
    long countByExample(JoinedTrainSamplesExample example);

    int deleteByExample(JoinedTrainSamplesExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(JoinedTrainSamples record);

    int insertSelective(JoinedTrainSamples record);

    List<JoinedTrainSamples> selectByExample(JoinedTrainSamplesExample example);

    JoinedTrainSamples selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") JoinedTrainSamples record, @Param("example") JoinedTrainSamplesExample example);

    int updateByExample(@Param("record") JoinedTrainSamples record, @Param("example") JoinedTrainSamplesExample example);

    int updateByPrimaryKeySelective(JoinedTrainSamples record);

    int updateByPrimaryKey(JoinedTrainSamples record);
}