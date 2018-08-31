package com.njust.mapper;

import com.njust.model.LlcSvrSvindics;
import com.njust.model.LlcSvrSvindicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcSvrSvindicsMapper {
    long countByExample(LlcSvrSvindicsExample example);

    int deleteByExample(LlcSvrSvindicsExample example);

    int insert(LlcSvrSvindics record);

    int insertSelective(LlcSvrSvindics record);

    List<LlcSvrSvindics> selectByExample(LlcSvrSvindicsExample example);

    int updateByExampleSelective(@Param("record") LlcSvrSvindics record, @Param("example") LlcSvrSvindicsExample example);

    int updateByExample(@Param("record") LlcSvrSvindics record, @Param("example") LlcSvrSvindicsExample example);
}