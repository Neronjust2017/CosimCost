package com.njust.mapper;

import com.njust.model.LlcResourceTree;
import com.njust.model.LlcResourceTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcResourceTreeMapper {
    long countByExample(LlcResourceTreeExample example);

    int deleteByExample(LlcResourceTreeExample example);

    int deleteByPrimaryKey(Integer resourceTreeId);

    int insert(LlcResourceTree record);

    int insertSelective(LlcResourceTree record);

    List<LlcResourceTree> selectByExample(LlcResourceTreeExample example);

    LlcResourceTree selectByPrimaryKey(Integer resourceTreeId);

    int updateByExampleSelective(@Param("record") LlcResourceTree record, @Param("example") LlcResourceTreeExample example);

    int updateByExample(@Param("record") LlcResourceTree record, @Param("example") LlcResourceTreeExample example);

    int updateByPrimaryKeySelective(LlcResourceTree record);

    int updateByPrimaryKey(LlcResourceTree record);
}