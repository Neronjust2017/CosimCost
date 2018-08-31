package com.njust.mapper;

import com.njust.model.LlcScheme;
import com.njust.model.LlcSchemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcSchemeMapper {
    long countByExample(LlcSchemeExample example);

    int deleteByExample(LlcSchemeExample example);

    int deleteByPrimaryKey(Integer schemeId);

    int insert(LlcScheme record);

    int insertSelective(LlcScheme record);

    List<LlcScheme> selectByExample(LlcSchemeExample example);

    LlcScheme selectByPrimaryKey(Integer schemeId);

    int updateByExampleSelective(@Param("record") LlcScheme record, @Param("example") LlcSchemeExample example);

    int updateByExample(@Param("record") LlcScheme record, @Param("example") LlcSchemeExample example);

    int updateByPrimaryKeySelective(LlcScheme record);

    int updateByPrimaryKey(LlcScheme record);
}