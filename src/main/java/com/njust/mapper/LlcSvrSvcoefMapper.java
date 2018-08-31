package com.njust.mapper;

import com.njust.model.LlcSvrSvcoef;
import com.njust.model.LlcSvrSvcoefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcSvrSvcoefMapper {
    long countByExample(LlcSvrSvcoefExample example);

    int deleteByExample(LlcSvrSvcoefExample example);

    int insert(LlcSvrSvcoef record);

    int insertSelective(LlcSvrSvcoef record);

    List<LlcSvrSvcoef> selectByExample(LlcSvrSvcoefExample example);

    int updateByExampleSelective(@Param("record") LlcSvrSvcoef record, @Param("example") LlcSvrSvcoefExample example);

    int updateByExample(@Param("record") LlcSvrSvcoef record, @Param("example") LlcSvrSvcoefExample example);
}