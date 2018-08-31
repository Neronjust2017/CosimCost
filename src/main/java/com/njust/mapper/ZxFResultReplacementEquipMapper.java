package com.njust.mapper;

import com.njust.model.ZxFResultReplacementEquip;
import com.njust.model.ZxFResultReplacementEquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxFResultReplacementEquipMapper {
    long countByExample(ZxFResultReplacementEquipExample example);

    int deleteByExample(ZxFResultReplacementEquipExample example);

    int insert(ZxFResultReplacementEquip record);

    int insertSelective(ZxFResultReplacementEquip record);

    List<ZxFResultReplacementEquip> selectByExample(ZxFResultReplacementEquipExample example);

    int updateByExampleSelective(@Param("record") ZxFResultReplacementEquip record, @Param("example") ZxFResultReplacementEquipExample example);

    int updateByExample(@Param("record") ZxFResultReplacementEquip record, @Param("example") ZxFResultReplacementEquipExample example);
}