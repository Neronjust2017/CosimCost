package com.njust.mapper;

import com.njust.model.HisDataInput;
import com.njust.model.HisDataInputExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisDataInputMapper {
    long countByExample(HisDataInputExample example);

    int deleteByExample(HisDataInputExample example);

    int deleteByPrimaryKey(BigDecimal dataId);

    int insert(HisDataInput record);

    int insertSelective(HisDataInput record);

    List<HisDataInput> selectByExample(HisDataInputExample example);

    HisDataInput selectByPrimaryKey(BigDecimal dataId);

    int updateByExampleSelective(@Param("record") HisDataInput record, @Param("example") HisDataInputExample example);

    int updateByExample(@Param("record") HisDataInput record, @Param("example") HisDataInputExample example);

    int updateByPrimaryKeySelective(HisDataInput record);

    int updateByPrimaryKey(HisDataInput record);
}