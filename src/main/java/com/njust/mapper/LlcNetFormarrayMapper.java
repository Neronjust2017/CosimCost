package com.njust.mapper;

import com.njust.model.LlcNetFormarray;
import com.njust.model.LlcNetFormarrayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcNetFormarrayMapper {
    long countByExample(LlcNetFormarrayExample example);

    int deleteByExample(LlcNetFormarrayExample example);

    int insert(LlcNetFormarray record);

    int insertSelective(LlcNetFormarray record);

    List<LlcNetFormarray> selectByExample(LlcNetFormarrayExample example);

    int updateByExampleSelective(@Param("record") LlcNetFormarray record, @Param("example") LlcNetFormarrayExample example);

    int updateByExample(@Param("record") LlcNetFormarray record, @Param("example") LlcNetFormarrayExample example);
}