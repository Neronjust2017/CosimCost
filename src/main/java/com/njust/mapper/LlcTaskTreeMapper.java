package com.njust.mapper;

import com.njust.model.LlcTaskTree;
import com.njust.model.LlcTaskTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcTaskTreeMapper {
    long countByExample(LlcTaskTreeExample example);

    int deleteByExample(LlcTaskTreeExample example);

    int deleteByPrimaryKey(Integer taskTreeId);

    int insert(LlcTaskTree record);

    int insertSelective(LlcTaskTree record);

    List<LlcTaskTree> selectByExample(LlcTaskTreeExample example);

    LlcTaskTree selectByPrimaryKey(Integer taskTreeId);

    int updateByExampleSelective(@Param("record") LlcTaskTree record, @Param("example") LlcTaskTreeExample example);

    int updateByExample(@Param("record") LlcTaskTree record, @Param("example") LlcTaskTreeExample example);

    int updateByPrimaryKeySelective(LlcTaskTree record);

    int updateByPrimaryKey(LlcTaskTree record);
}