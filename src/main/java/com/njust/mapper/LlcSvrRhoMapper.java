package com.njust.mapper;

import com.njust.model.LlcSvrRho;
import com.njust.model.LlcSvrRhoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcSvrRhoMapper {
    long countByExample(LlcSvrRhoExample example);

    int deleteByExample(LlcSvrRhoExample example);

    int insert(LlcSvrRho record);

    int insertSelective(LlcSvrRho record);

    List<LlcSvrRho> selectByExample(LlcSvrRhoExample example);

    int updateByExampleSelective(@Param("record") LlcSvrRho record, @Param("example") LlcSvrRhoExample example);

    int updateByExample(@Param("record") LlcSvrRho record, @Param("example") LlcSvrRhoExample example);
}