package com.njust.mapper;

import com.njust.model.LzOptResultSpare;
import com.njust.model.LzOptResultSpareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzOptResultSpareMapper {
    long countByExample(LzOptResultSpareExample example);

    int deleteByExample(LzOptResultSpareExample example);

    int insert(LzOptResultSpare record);

    int insertSelective(LzOptResultSpare record);

    List<LzOptResultSpare> selectByExample(LzOptResultSpareExample example);

    int updateByExampleSelective(@Param("record") LzOptResultSpare record, @Param("example") LzOptResultSpareExample example);

    int updateByExample(@Param("record") LzOptResultSpare record, @Param("example") LzOptResultSpareExample example);
}