package com.njust.mapper;

import com.njust.model.ZxFResultRevEquip;
import com.njust.model.ZxFResultRevEquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxFResultRevEquipMapper {
    long countByExample(ZxFResultRevEquipExample example);

    int deleteByExample(ZxFResultRevEquipExample example);

    int insert(ZxFResultRevEquip record);

    int insertSelective(ZxFResultRevEquip record);

    List<ZxFResultRevEquip> selectByExample(ZxFResultRevEquipExample example);

    int updateByExampleSelective(@Param("record") ZxFResultRevEquip record, @Param("example") ZxFResultRevEquipExample example);

    int updateByExample(@Param("record") ZxFResultRevEquip record, @Param("example") ZxFResultRevEquipExample example);
}