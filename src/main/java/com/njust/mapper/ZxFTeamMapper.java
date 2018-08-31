package com.njust.mapper;

import com.njust.model.ZxFTeam;
import com.njust.model.ZxFTeamExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxFTeamMapper {
    long countByExample(ZxFTeamExample example);

    int deleteByExample(ZxFTeamExample example);

    int deleteByPrimaryKey(BigDecimal fTeamId);

    int insert(ZxFTeam record);

    int insertSelective(ZxFTeam record);

    List<ZxFTeam> selectByExample(ZxFTeamExample example);

    ZxFTeam selectByPrimaryKey(BigDecimal fTeamId);

    int updateByExampleSelective(@Param("record") ZxFTeam record, @Param("example") ZxFTeamExample example);

    int updateByExample(@Param("record") ZxFTeam record, @Param("example") ZxFTeamExample example);

    int updateByPrimaryKeySelective(ZxFTeam record);

    int updateByPrimaryKey(ZxFTeam record);
}