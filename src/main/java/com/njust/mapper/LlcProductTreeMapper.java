package com.njust.mapper;

import com.njust.model.LlcProductTree;
import com.njust.model.LlcProductTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcProductTreeMapper {
    long countByExample(LlcProductTreeExample example);

    int deleteByExample(LlcProductTreeExample example);

    int deleteByPrimaryKey(Integer productTreeId);

    int insert(LlcProductTree record);

    int insertSelective(LlcProductTree record);

    List<LlcProductTree> selectByExample(LlcProductTreeExample example);

    LlcProductTree selectByPrimaryKey(Integer productTreeId);

    int updateByExampleSelective(@Param("record") LlcProductTree record, @Param("example") LlcProductTreeExample example);

    int updateByExample(@Param("record") LlcProductTree record, @Param("example") LlcProductTreeExample example);

    int updateByPrimaryKeySelective(LlcProductTree record);

    int updateByPrimaryKey(LlcProductTree record);
}