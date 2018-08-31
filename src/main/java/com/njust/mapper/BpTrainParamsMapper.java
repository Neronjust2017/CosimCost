package com.njust.mapper;

import com.njust.model.BpTrainParams;
import com.njust.model.BpTrainParamsExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BpTrainParamsMapper {
    long countByExample(BpTrainParamsExample example);

    int deleteByExample(BpTrainParamsExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(BpTrainParams record);

    int insertSelective(BpTrainParams record);

    List<BpTrainParams> selectByExample(BpTrainParamsExample example);

    BpTrainParams selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") BpTrainParams record, @Param("example") BpTrainParamsExample example);

    int updateByExample(@Param("record") BpTrainParams record, @Param("example") BpTrainParamsExample example);

    int updateByPrimaryKeySelective(BpTrainParams record);

    int updateByPrimaryKey(BpTrainParams record);
}