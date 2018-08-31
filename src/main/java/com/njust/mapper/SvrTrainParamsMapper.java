package com.njust.mapper;

import com.njust.model.SvrTrainParams;
import com.njust.model.SvrTrainParamsExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SvrTrainParamsMapper {
    long countByExample(SvrTrainParamsExample example);

    int deleteByExample(SvrTrainParamsExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SvrTrainParams record);

    int insertSelective(SvrTrainParams record);

    List<SvrTrainParams> selectByExample(SvrTrainParamsExample example);

    SvrTrainParams selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SvrTrainParams record, @Param("example") SvrTrainParamsExample example);

    int updateByExample(@Param("record") SvrTrainParams record, @Param("example") SvrTrainParamsExample example);

    int updateByPrimaryKeySelective(SvrTrainParams record);

    int updateByPrimaryKey(SvrTrainParams record);
}