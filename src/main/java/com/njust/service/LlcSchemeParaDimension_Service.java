package com.njust.service;

import com.njust.model.LlcSchemeParaDimension;
import com.njust.model.LlcSchemeParaDimensionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LlcSchemeParaDimension_Service {

    long countByExample(LlcSchemeParaDimensionExample example);

    int deleteByExample(LlcSchemeParaDimensionExample example);

    int insert(LlcSchemeParaDimension record);

    int insertSelective(LlcSchemeParaDimension record);

    List<LlcSchemeParaDimension> selectByExample(LlcSchemeParaDimensionExample example);

    int updateByExampleSelective(@Param("record") LlcSchemeParaDimension record, @Param("example") LlcSchemeParaDimensionExample example);

    int updateByExample(@Param("record") LlcSchemeParaDimension record, @Param("example") LlcSchemeParaDimensionExample example);
}
