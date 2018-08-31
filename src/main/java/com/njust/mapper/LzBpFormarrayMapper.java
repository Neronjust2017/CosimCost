package com.njust.mapper;

import com.njust.model.LzBpFormarray;
import com.njust.model.LzBpFormarrayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzBpFormarrayMapper {
    long countByExample(LzBpFormarrayExample example);

    int deleteByExample(LzBpFormarrayExample example);

    int insert(LzBpFormarray record);

    int insertSelective(LzBpFormarray record);

    List<LzBpFormarray> selectByExample(LzBpFormarrayExample example);

    int updateByExampleSelective(@Param("record") LzBpFormarray record, @Param("example") LzBpFormarrayExample example);

    int updateByExample(@Param("record") LzBpFormarray record, @Param("example") LzBpFormarrayExample example);
}