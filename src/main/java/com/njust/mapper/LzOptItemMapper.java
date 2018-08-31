package com.njust.mapper;

import com.njust.model.LzOptItem;
import com.njust.model.LzOptItemExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzOptItemMapper {
    long countByExample(LzOptItemExample example);

    int deleteByExample(LzOptItemExample example);

    int deleteByPrimaryKey(BigDecimal yItemId);

    int insert(LzOptItem record);

    int insertSelective(LzOptItem record);

    List<LzOptItem> selectByExample(LzOptItemExample example);

    LzOptItem selectByPrimaryKey(BigDecimal yItemId);

    int updateByExampleSelective(@Param("record") LzOptItem record, @Param("example") LzOptItemExample example);

    int updateByExample(@Param("record") LzOptItem record, @Param("example") LzOptItemExample example);

    int updateByPrimaryKeySelective(LzOptItem record);

    int updateByPrimaryKey(LzOptItem record);
}