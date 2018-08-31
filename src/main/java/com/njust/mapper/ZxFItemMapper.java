package com.njust.mapper;

import com.njust.model.ZxFItem;
import com.njust.model.ZxFItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxFItemMapper {
    long countByExample(ZxFItemExample example);

    int deleteByExample(ZxFItemExample example);

    int insert(ZxFItem record);

    int insertSelective(ZxFItem record);

    List<ZxFItem> selectByExample(ZxFItemExample example);

    int updateByExampleSelective(@Param("record") ZxFItem record, @Param("example") ZxFItemExample example);

    int updateByExample(@Param("record") ZxFItem record, @Param("example") ZxFItemExample example);
}