package com.njust.mapper;

import com.njust.model.LlcNetMinin;
import com.njust.model.LlcNetMininExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcNetMininMapper {
    long countByExample(LlcNetMininExample example);

    int deleteByExample(LlcNetMininExample example);

    int insert(LlcNetMinin record);

    int insertSelective(LlcNetMinin record);

    List<LlcNetMinin> selectByExample(LlcNetMininExample example);

    int updateByExampleSelective(@Param("record") LlcNetMinin record, @Param("example") LlcNetMininExample example);

    int updateByExample(@Param("record") LlcNetMinin record, @Param("example") LlcNetMininExample example);
}