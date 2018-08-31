package com.njust.mapper;

import com.njust.model.LlcTechnologyTree;
import com.njust.model.LlcTechnologyTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcTechnologyTreeMapper {
    long countByExample(LlcTechnologyTreeExample example);

    int deleteByExample(LlcTechnologyTreeExample example);

    int deleteByPrimaryKey(Integer technologyTreeId);

    int insert(LlcTechnologyTree record);

    int insertSelective(LlcTechnologyTree record);

    List<LlcTechnologyTree> selectByExample(LlcTechnologyTreeExample example);

    LlcTechnologyTree selectByPrimaryKey(Integer technologyTreeId);

    int updateByExampleSelective(@Param("record") LlcTechnologyTree record, @Param("example") LlcTechnologyTreeExample example);

    int updateByExample(@Param("record") LlcTechnologyTree record, @Param("example") LlcTechnologyTreeExample example);

    int updateByPrimaryKeySelective(LlcTechnologyTree record);

    int updateByPrimaryKey(LlcTechnologyTree record);
}