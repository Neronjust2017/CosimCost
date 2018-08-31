package com.njust.mapper;

import com.njust.model.ZxItem;
import com.njust.model.ZxItemExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxItemMapper {
    long countByExample(ZxItemExample example);

    int deleteByExample(ZxItemExample example);

    int deleteByPrimaryKey(BigDecimal itemId);

    int insert(ZxItem record);

    int insertSelective(ZxItem record);

    List<ZxItem> selectByExample(ZxItemExample example);

    ZxItem selectByPrimaryKey(BigDecimal itemId);

    int updateByExampleSelective(@Param("record") ZxItem record, @Param("example") ZxItemExample example);

    int updateByExample(@Param("record") ZxItem record, @Param("example") ZxItemExample example);

    int updateByPrimaryKeySelective(ZxItem record);

    int updateByPrimaryKey(ZxItem record);
}