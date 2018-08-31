package com.njust.mapper;

import com.njust.model.LzBpMaxout;
import com.njust.model.LzBpMaxoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzBpMaxoutMapper {
    long countByExample(LzBpMaxoutExample example);

    int deleteByExample(LzBpMaxoutExample example);

    int insert(LzBpMaxout record);

    int insertSelective(LzBpMaxout record);

    List<LzBpMaxout> selectByExample(LzBpMaxoutExample example);

    int updateByExampleSelective(@Param("record") LzBpMaxout record, @Param("example") LzBpMaxoutExample example);

    int updateByExample(@Param("record") LzBpMaxout record, @Param("example") LzBpMaxoutExample example);
}