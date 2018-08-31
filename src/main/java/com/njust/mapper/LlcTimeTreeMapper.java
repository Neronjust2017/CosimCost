package com.njust.mapper;

import com.njust.model.LlcTimeTree;
import com.njust.model.LlcTimeTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcTimeTreeMapper {
    long countByExample(LlcTimeTreeExample example);

    int deleteByExample(LlcTimeTreeExample example);

    int deleteByPrimaryKey(Integer timeTreeId);

    int insert(LlcTimeTree record);

    int insertSelective(LlcTimeTree record);

    List<LlcTimeTree> selectByExample(LlcTimeTreeExample example);

    LlcTimeTree selectByPrimaryKey(Integer timeTreeId);

    int updateByExampleSelective(@Param("record") LlcTimeTree record, @Param("example") LlcTimeTreeExample example);

    int updateByExample(@Param("record") LlcTimeTree record, @Param("example") LlcTimeTreeExample example);

    int updateByPrimaryKeySelective(LlcTimeTree record);

    int updateByPrimaryKey(LlcTimeTree record);
}