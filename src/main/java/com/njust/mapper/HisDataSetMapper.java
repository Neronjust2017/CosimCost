package com.njust.mapper;

import com.njust.model.HisDataSet;
import com.njust.model.HisDataSetExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisDataSetMapper {
    long countByExample(HisDataSetExample example);

    int deleteByExample(HisDataSetExample example);

    int deleteByPrimaryKey(BigDecimal setId);

    int insert(HisDataSet record);

    int insertSelective(HisDataSet record);

    List<HisDataSet> selectByExample(HisDataSetExample example);

    HisDataSet selectByPrimaryKey(BigDecimal setId);

    int updateByExampleSelective(@Param("record") HisDataSet record, @Param("example") HisDataSetExample example);

    int updateByExample(@Param("record") HisDataSet record, @Param("example") HisDataSetExample example);

    int updateByPrimaryKeySelective(HisDataSet record);

    int updateByPrimaryKey(HisDataSet record);
}