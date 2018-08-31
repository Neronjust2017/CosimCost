package com.njust.mapper;

import com.njust.model.LlcSchemeResult;
import com.njust.model.LlcSchemeResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcSchemeResultMapper {
    long countByExample(LlcSchemeResultExample example);

    int deleteByExample(LlcSchemeResultExample example);

    int insert(LlcSchemeResult record);

    int insertSelective(LlcSchemeResult record);

    List<LlcSchemeResult> selectByExample(LlcSchemeResultExample example);

    int updateByExampleSelective(@Param("record") LlcSchemeResult record, @Param("example") LlcSchemeResultExample example);

    int updateByExample(@Param("record") LlcSchemeResult record, @Param("example") LlcSchemeResultExample example);
}