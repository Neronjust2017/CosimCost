package com.njust.mapper;

import com.njust.model.LlcSvrSv;
import com.njust.model.LlcSvrSvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcSvrSvMapper {
    long countByExample(LlcSvrSvExample example);

    int deleteByExample(LlcSvrSvExample example);

    int insert(LlcSvrSv record);

    int insertSelective(LlcSvrSv record);

    List<LlcSvrSv> selectByExample(LlcSvrSvExample example);

    int updateByExampleSelective(@Param("record") LlcSvrSv record, @Param("example") LlcSvrSvExample example);

    int updateByExample(@Param("record") LlcSvrSv record, @Param("example") LlcSvrSvExample example);
}