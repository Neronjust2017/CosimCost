package com.njust.mapper;

import com.njust.model.LzSvrSvcoef;
import com.njust.model.LzSvrSvcoefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzSvrSvcoefMapper {
    long countByExample(LzSvrSvcoefExample example);

    int deleteByExample(LzSvrSvcoefExample example);

    int insert(LzSvrSvcoef record);

    int insertSelective(LzSvrSvcoef record);

    List<LzSvrSvcoef> selectByExample(LzSvrSvcoefExample example);

    int updateByExampleSelective(@Param("record") LzSvrSvcoef record, @Param("example") LzSvrSvcoefExample example);

    int updateByExample(@Param("record") LzSvrSvcoef record, @Param("example") LzSvrSvcoefExample example);
}