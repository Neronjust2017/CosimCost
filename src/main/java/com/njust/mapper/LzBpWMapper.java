package com.njust.mapper;

import com.njust.model.LzBpW;
import com.njust.model.LzBpWExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzBpWMapper {
    long countByExample(LzBpWExample example);

    int deleteByExample(LzBpWExample example);

    int insert(LzBpW record);

    int insertSelective(LzBpW record);

    List<LzBpW> selectByExample(LzBpWExample example);

    int updateByExampleSelective(@Param("record") LzBpW record, @Param("example") LzBpWExample example);

    int updateByExample(@Param("record") LzBpW record, @Param("example") LzBpWExample example);
}