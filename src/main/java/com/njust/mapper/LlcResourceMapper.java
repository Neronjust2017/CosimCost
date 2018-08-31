package com.njust.mapper;

import com.njust.model.LlcResource;
import com.njust.model.LlcResourceExample;
import com.njust.model.LlcResourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcResourceMapper {
    long countByExample(LlcResourceExample example);

    int deleteByExample(LlcResourceExample example);

    int deleteByPrimaryKey(LlcResourceKey key);

    int insert(LlcResource record);

    int insertSelective(LlcResource record);

    List<LlcResource> selectByExample(LlcResourceExample example);

    LlcResource selectByPrimaryKey(LlcResourceKey key);

    int updateByExampleSelective(@Param("record") LlcResource record, @Param("example") LlcResourceExample example);

    int updateByExample(@Param("record") LlcResource record, @Param("example") LlcResourceExample example);

    int updateByPrimaryKeySelective(LlcResource record);

    int updateByPrimaryKey(LlcResource record);
}