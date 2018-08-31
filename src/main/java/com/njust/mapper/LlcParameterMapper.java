package com.njust.mapper;

import com.njust.model.LlcParameter;
import com.njust.model.LlcParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcParameterMapper {
    long countByExample(LlcParameterExample example);

    int deleteByExample(LlcParameterExample example);

    int deleteByPrimaryKey(Integer parameterId);

    int insert(LlcParameter record);

    int insertSelective(LlcParameter record);

    List<LlcParameter> selectByExample(LlcParameterExample example);

    LlcParameter selectByPrimaryKey(Integer parameterId);

    int updateByExampleSelective(@Param("record") LlcParameter record, @Param("example") LlcParameterExample example);

    int updateByExample(@Param("record") LlcParameter record, @Param("example") LlcParameterExample example);

    int updateByPrimaryKeySelective(LlcParameter record);

    int updateByPrimaryKey(LlcParameter record);
}