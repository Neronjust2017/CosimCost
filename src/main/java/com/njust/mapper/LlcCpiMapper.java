package com.njust.mapper;

import com.njust.model.LlcCpi;
import com.njust.model.LlcCpiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcCpiMapper {
    long countByExample(LlcCpiExample example);

    int deleteByExample(LlcCpiExample example);

    int deleteByPrimaryKey(String year);

    int insert(LlcCpi record);

    int insertSelective(LlcCpi record);

    List<LlcCpi> selectByExample(LlcCpiExample example);

    LlcCpi selectByPrimaryKey(String year);

    int updateByExampleSelective(@Param("record") LlcCpi record, @Param("example") LlcCpiExample example);

    int updateByExample(@Param("record") LlcCpi record, @Param("example") LlcCpiExample example);

    int updateByPrimaryKeySelective(LlcCpi record);

    int updateByPrimaryKey(LlcCpi record);
}