package com.njust.mapper;

import com.njust.model.ZxStation;
import com.njust.model.ZxStationExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxStationMapper {
    long countByExample(ZxStationExample example);

    int deleteByExample(ZxStationExample example);

    int deleteByPrimaryKey(BigDecimal staId);

    int insert(ZxStation record);

    int insertSelective(ZxStation record);

    List<ZxStation> selectByExample(ZxStationExample example);

    ZxStation selectByPrimaryKey(BigDecimal staId);

    int updateByExampleSelective(@Param("record") ZxStation record, @Param("example") ZxStationExample example);

    int updateByExample(@Param("record") ZxStation record, @Param("example") ZxStationExample example);

    int updateByPrimaryKeySelective(ZxStation record);

    int updateByPrimaryKey(ZxStation record);
}