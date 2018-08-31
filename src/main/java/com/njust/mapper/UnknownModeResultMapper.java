package com.njust.mapper;

import com.njust.model.UnknownModeResult;
import com.njust.model.UnknownModeResultExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnknownModeResultMapper {
    long countByExample(UnknownModeResultExample example);

    int deleteByExample(UnknownModeResultExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(UnknownModeResult record);

    int insertSelective(UnknownModeResult record);

    List<UnknownModeResult> selectByExample(UnknownModeResultExample example);

    UnknownModeResult selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") UnknownModeResult record, @Param("example") UnknownModeResultExample example);

    int updateByExample(@Param("record") UnknownModeResult record, @Param("example") UnknownModeResultExample example);

    int updateByPrimaryKeySelective(UnknownModeResult record);

    int updateByPrimaryKey(UnknownModeResult record);
}