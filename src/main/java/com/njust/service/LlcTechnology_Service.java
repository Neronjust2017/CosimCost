package com.njust.service;

import com.njust.model.LlcTechnology;
import com.njust.model.LlcTechnologyExample;
import com.njust.model.LlcTechnologyKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LlcTechnology_Service {

    long countByExample(LlcTechnologyExample example);

    int deleteByExample(LlcTechnologyExample example);

    int deleteByPrimaryKey(LlcTechnologyKey key);

    int insert(LlcTechnology record);

    int insertSelective(LlcTechnology record);

    List<LlcTechnology> selectByExample(LlcTechnologyExample example);

    LlcTechnology selectByPrimaryKey(LlcTechnologyKey key);

    int updateByExampleSelective(@Param("record") LlcTechnology record, @Param("example") LlcTechnologyExample example);

    int updateByExample(@Param("record") LlcTechnology record, @Param("example") LlcTechnologyExample example);

    int updateByPrimaryKeySelective(LlcTechnology record);

    int updateByPrimaryKey(LlcTechnology record);
}
