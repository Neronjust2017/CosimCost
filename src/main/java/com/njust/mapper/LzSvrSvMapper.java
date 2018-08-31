package com.njust.mapper;

import com.njust.model.LzSvrSv;
import com.njust.model.LzSvrSvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzSvrSvMapper {
    long countByExample(LzSvrSvExample example);

    int deleteByExample(LzSvrSvExample example);

    int insert(LzSvrSv record);

    int insertSelective(LzSvrSv record);

    List<LzSvrSv> selectByExample(LzSvrSvExample example);

    int updateByExampleSelective(@Param("record") LzSvrSv record, @Param("example") LzSvrSvExample example);

    int updateByExample(@Param("record") LzSvrSv record, @Param("example") LzSvrSvExample example);
}