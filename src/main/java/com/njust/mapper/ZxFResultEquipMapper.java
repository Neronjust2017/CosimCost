package com.njust.mapper;

import com.njust.model.ZxFResultEquip;
import com.njust.model.ZxFResultEquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxFResultEquipMapper {
    long countByExample(ZxFResultEquipExample example);

    int deleteByExample(ZxFResultEquipExample example);

    int insert(ZxFResultEquip record);

    int insertSelective(ZxFResultEquip record);

    List<ZxFResultEquip> selectByExample(ZxFResultEquipExample example);

    int updateByExampleSelective(@Param("record") ZxFResultEquip record, @Param("example") ZxFResultEquipExample example);

    int updateByExample(@Param("record") ZxFResultEquip record, @Param("example") ZxFResultEquipExample example);
}