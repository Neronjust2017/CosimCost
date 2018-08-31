package com.njust.mapper;

import com.njust.model.LzSvrSvindics;
import com.njust.model.LzSvrSvindicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzSvrSvindicsMapper {
    long countByExample(LzSvrSvindicsExample example);

    int deleteByExample(LzSvrSvindicsExample example);

    int insert(LzSvrSvindics record);

    int insertSelective(LzSvrSvindics record);

    List<LzSvrSvindics> selectByExample(LzSvrSvindicsExample example);

    int updateByExampleSelective(@Param("record") LzSvrSvindics record, @Param("example") LzSvrSvindicsExample example);

    int updateByExample(@Param("record") LzSvrSvindics record, @Param("example") LzSvrSvindicsExample example);
}