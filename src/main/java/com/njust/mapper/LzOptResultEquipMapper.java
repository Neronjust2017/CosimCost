package com.njust.mapper;

import com.njust.model.LzOptResultEquip;
import com.njust.model.LzOptResultEquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzOptResultEquipMapper {
    long countByExample(LzOptResultEquipExample example);

    int deleteByExample(LzOptResultEquipExample example);

    int insert(LzOptResultEquip record);

    int insertSelective(LzOptResultEquip record);

    List<LzOptResultEquip> selectByExample(LzOptResultEquipExample example);

    int updateByExampleSelective(@Param("record") LzOptResultEquip record, @Param("example") LzOptResultEquipExample example);

    int updateByExample(@Param("record") LzOptResultEquip record, @Param("example") LzOptResultEquipExample example);
}