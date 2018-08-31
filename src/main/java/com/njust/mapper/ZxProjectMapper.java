package com.njust.mapper;

import com.njust.model.ZxProject;
import com.njust.model.ZxProjectExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxProjectMapper {
    long countByExample(ZxProjectExample example);

    int deleteByExample(ZxProjectExample example);

    int deleteByPrimaryKey(BigDecimal proId);

    int insert(ZxProject record);

    int insertSelective(ZxProject record);

    List<ZxProject> selectByExample(ZxProjectExample example);

    ZxProject selectByPrimaryKey(BigDecimal proId);

    int updateByExampleSelective(@Param("record") ZxProject record, @Param("example") ZxProjectExample example);

    int updateByExample(@Param("record") ZxProject record, @Param("example") ZxProjectExample example);

    int updateByPrimaryKeySelective(ZxProject record);

    int updateByPrimaryKey(ZxProject record);
}