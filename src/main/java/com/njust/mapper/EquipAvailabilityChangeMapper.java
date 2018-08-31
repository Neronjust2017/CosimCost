package com.njust.mapper;

import com.njust.model.EquipAvailabilityChange;
import com.njust.model.EquipAvailabilityChangeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipAvailabilityChangeMapper {
    long countByExample(EquipAvailabilityChangeExample example);

    int deleteByExample(EquipAvailabilityChangeExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(EquipAvailabilityChange record);

    int insertSelective(EquipAvailabilityChange record);

    List<EquipAvailabilityChange> selectByExample(EquipAvailabilityChangeExample example);

    EquipAvailabilityChange selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") EquipAvailabilityChange record, @Param("example") EquipAvailabilityChangeExample example);

    int updateByExample(@Param("record") EquipAvailabilityChange record, @Param("example") EquipAvailabilityChangeExample example);

    int updateByPrimaryKeySelective(EquipAvailabilityChange record);

    int updateByPrimaryKey(EquipAvailabilityChange record);
}