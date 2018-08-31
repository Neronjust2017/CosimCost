package com.njust.mapper;

import com.njust.model.ZxFResultTeam;
import com.njust.model.ZxFResultTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxFResultTeamMapper {
    long countByExample(ZxFResultTeamExample example);

    int deleteByExample(ZxFResultTeamExample example);

    int insert(ZxFResultTeam record);

    int insertSelective(ZxFResultTeam record);

    List<ZxFResultTeam> selectByExample(ZxFResultTeamExample example);

    int updateByExampleSelective(@Param("record") ZxFResultTeam record, @Param("example") ZxFResultTeamExample example);

    int updateByExample(@Param("record") ZxFResultTeam record, @Param("example") ZxFResultTeamExample example);
}