package com.njust.mapper;

import com.njust.model.LzBpMinin;
import com.njust.model.LzBpMininExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzBpMininMapper {
    long countByExample(LzBpMininExample example);

    int deleteByExample(LzBpMininExample example);

    int insert(LzBpMinin record);

    int insertSelective(LzBpMinin record);

    List<LzBpMinin> selectByExample(LzBpMininExample example);

    int updateByExampleSelective(@Param("record") LzBpMinin record, @Param("example") LzBpMininExample example);

    int updateByExample(@Param("record") LzBpMinin record, @Param("example") LzBpMininExample example);
}