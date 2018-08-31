package com.njust.mapper;

import com.njust.model.LlcNetW;
import com.njust.model.LlcNetWExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcNetWMapper {
    long countByExample(LlcNetWExample example);

    int deleteByExample(LlcNetWExample example);

    int insert(LlcNetW record);

    int insertSelective(LlcNetW record);

    List<LlcNetW> selectByExample(LlcNetWExample example);

    int updateByExampleSelective(@Param("record") LlcNetW record, @Param("example") LlcNetWExample example);

    int updateByExample(@Param("record") LlcNetW record, @Param("example") LlcNetWExample example);
}