package com.njust.mapper;

import com.njust.model.HisDataStructure;
import com.njust.model.HisDataStructureExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisDataStructureMapper {
    long countByExample(HisDataStructureExample example);

    int deleteByExample(HisDataStructureExample example);

    int deleteByPrimaryKey(BigDecimal attrId);

    int insert(HisDataStructure record);

    int insertSelective(HisDataStructure record);

    List<HisDataStructure> selectByExample(HisDataStructureExample example);

    HisDataStructure selectByPrimaryKey(BigDecimal attrId);

    int updateByExampleSelective(@Param("record") HisDataStructure record, @Param("example") HisDataStructureExample example);

    int updateByExample(@Param("record") HisDataStructure record, @Param("example") HisDataStructureExample example);

    int updateByPrimaryKeySelective(HisDataStructure record);

    int updateByPrimaryKey(HisDataStructure record);
}