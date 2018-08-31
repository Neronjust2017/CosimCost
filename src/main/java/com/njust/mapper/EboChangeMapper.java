package com.njust.mapper;

import com.njust.model.EboChange;
import com.njust.model.EboChangeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EboChangeMapper {
    long countByExample(EboChangeExample example);

    int deleteByExample(EboChangeExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(EboChange record);

    int insertSelective(EboChange record);

    List<EboChange> selectByExample(EboChangeExample example);

    EboChange selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") EboChange record, @Param("example") EboChangeExample example);

    int updateByExample(@Param("record") EboChange record, @Param("example") EboChangeExample example);

    int updateByPrimaryKeySelective(EboChange record);

    int updateByPrimaryKey(EboChange record);
}