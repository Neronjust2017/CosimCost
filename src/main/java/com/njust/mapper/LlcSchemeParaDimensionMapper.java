package com.njust.mapper;

import com.njust.model.LlcSchemeParaDimension;
import com.njust.model.LlcSchemeParaDimensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcSchemeParaDimensionMapper {
    long countByExample(LlcSchemeParaDimensionExample example);

    int deleteByExample(LlcSchemeParaDimensionExample example);

    int insert(LlcSchemeParaDimension record);

    int insertSelective(LlcSchemeParaDimension record);

    List<LlcSchemeParaDimension> selectByExample(LlcSchemeParaDimensionExample example);

    int updateByExampleSelective(@Param("record") LlcSchemeParaDimension record, @Param("example") LlcSchemeParaDimensionExample example);

    int updateByExample(@Param("record") LlcSchemeParaDimension record, @Param("example") LlcSchemeParaDimensionExample example);
}