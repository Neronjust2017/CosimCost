package com.njust.mapper;

import com.njust.model.PredictDataInput;
import com.njust.model.PredictDataInputExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PredictDataInputMapper {
    long countByExample(PredictDataInputExample example);

    int deleteByExample(PredictDataInputExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(PredictDataInput record);

    int insertSelective(PredictDataInput record);

    List<PredictDataInput> selectByExample(PredictDataInputExample example);

    PredictDataInput selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") PredictDataInput record, @Param("example") PredictDataInputExample example);

    int updateByExample(@Param("record") PredictDataInput record, @Param("example") PredictDataInputExample example);

    int updateByPrimaryKeySelective(PredictDataInput record);

    int updateByPrimaryKey(PredictDataInput record);
}