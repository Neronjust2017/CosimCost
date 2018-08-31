package com.njust.mapper;

import com.njust.model.UnknownMode;
import com.njust.model.UnknownModeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnknownModeMapper {
    long countByExample(UnknownModeExample example);

    int deleteByExample(UnknownModeExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(UnknownMode record);

    int insertSelective(UnknownMode record);

    List<UnknownMode> selectByExample(UnknownModeExample example);

    UnknownMode selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") UnknownMode record, @Param("example") UnknownModeExample example);

    int updateByExample(@Param("record") UnknownMode record, @Param("example") UnknownModeExample example);

    int updateByPrimaryKeySelective(UnknownMode record);

    int updateByPrimaryKey(UnknownMode record);
}