package com.njust.mapper;

import com.njust.model.LzSvrRho;
import com.njust.model.LzSvrRhoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzSvrRhoMapper {
    long countByExample(LzSvrRhoExample example);

    int deleteByExample(LzSvrRhoExample example);

    int insert(LzSvrRho record);

    int insertSelective(LzSvrRho record);

    List<LzSvrRho> selectByExample(LzSvrRhoExample example);

    int updateByExampleSelective(@Param("record") LzSvrRho record, @Param("example") LzSvrRhoExample example);

    int updateByExample(@Param("record") LzSvrRho record, @Param("example") LzSvrRhoExample example);
}