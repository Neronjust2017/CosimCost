package com.njust.mapper;

import com.njust.model.LlcDataParameter;
import com.njust.model.LlcDataParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcDataParameterMapper {
    long countByExample(LlcDataParameterExample example);

    int deleteByExample(LlcDataParameterExample example);

    int deleteByPrimaryKey(String dataparameterid);

    int insert(LlcDataParameter record);

    int insertSelective(LlcDataParameter record);

    List<LlcDataParameter> selectByExample(LlcDataParameterExample example);

    LlcDataParameter selectByPrimaryKey(String dataparameterid);

    int updateByExampleSelective(@Param("record") LlcDataParameter record, @Param("example") LlcDataParameterExample example);

    int updateByExample(@Param("record") LlcDataParameter record, @Param("example") LlcDataParameterExample example);

    int updateByPrimaryKeySelective(LlcDataParameter record);

    int updateByPrimaryKey(LlcDataParameter record);
}