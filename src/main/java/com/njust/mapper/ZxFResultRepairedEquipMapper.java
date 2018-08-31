package com.njust.mapper;

import com.njust.model.ZxFResultRepairedEquip;
import com.njust.model.ZxFResultRepairedEquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxFResultRepairedEquipMapper {
    long countByExample(ZxFResultRepairedEquipExample example);

    int deleteByExample(ZxFResultRepairedEquipExample example);

    int insert(ZxFResultRepairedEquip record);

    int insertSelective(ZxFResultRepairedEquip record);

    List<ZxFResultRepairedEquip> selectByExample(ZxFResultRepairedEquipExample example);

    int updateByExampleSelective(@Param("record") ZxFResultRepairedEquip record, @Param("example") ZxFResultRepairedEquipExample example);

    int updateByExample(@Param("record") ZxFResultRepairedEquip record, @Param("example") ZxFResultRepairedEquipExample example);
}