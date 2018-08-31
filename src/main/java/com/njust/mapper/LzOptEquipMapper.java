package com.njust.mapper;

import com.njust.model.LzOptEquip;
import com.njust.model.LzOptEquipExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzOptEquipMapper {
    long countByExample(LzOptEquipExample example);

    int deleteByExample(LzOptEquipExample example);

    int deleteByPrimaryKey(BigDecimal yEquipId);

    int insert(LzOptEquip record);

    int insertSelective(LzOptEquip record);

    List<LzOptEquip> selectByExample(LzOptEquipExample example);

    LzOptEquip selectByPrimaryKey(BigDecimal yEquipId);

    int updateByExampleSelective(@Param("record") LzOptEquip record, @Param("example") LzOptEquipExample example);

    int updateByExample(@Param("record") LzOptEquip record, @Param("example") LzOptEquipExample example);

    int updateByPrimaryKeySelective(LzOptEquip record);

    int updateByPrimaryKey(LzOptEquip record);
}