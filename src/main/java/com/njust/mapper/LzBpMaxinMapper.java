package com.njust.mapper;

import com.njust.model.LzBpMaxin;
import com.njust.model.LzBpMaxinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzBpMaxinMapper {
    long countByExample(LzBpMaxinExample example);

    int deleteByExample(LzBpMaxinExample example);

    int insert(LzBpMaxin record);

    int insertSelective(LzBpMaxin record);

    List<LzBpMaxin> selectByExample(LzBpMaxinExample example);

    int updateByExampleSelective(@Param("record") LzBpMaxin record, @Param("example") LzBpMaxinExample example);

    int updateByExample(@Param("record") LzBpMaxin record, @Param("example") LzBpMaxinExample example);
}