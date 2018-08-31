package com.njust.mapper;

import com.njust.model.LlcTechnology;
import com.njust.model.LlcTechnologyExample;
import com.njust.model.LlcTechnologyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcTechnologyMapper {
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