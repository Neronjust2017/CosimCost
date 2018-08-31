package com.njust.service;

import com.njust.model.LlcScheme;
import com.njust.model.LlcSchemeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LlcScheme_Service {

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
