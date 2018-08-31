package com.njust.mapper;

import com.njust.model.ZxVersion;
import com.njust.model.ZxVersionExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxVersionMapper {
    long countByExample(ZxVersionExample example);

    int deleteByExample(ZxVersionExample example);

    int deleteByPrimaryKey(BigDecimal vsId);

    int insert(ZxVersion record);

    int insertSelective(ZxVersion record);

    List<ZxVersion> selectByExample(ZxVersionExample example);

    ZxVersion selectByPrimaryKey(BigDecimal vsId);

    int updateByExampleSelective(@Param("record") ZxVersion record, @Param("example") ZxVersionExample example);

    int updateByExample(@Param("record") ZxVersion record, @Param("example") ZxVersionExample example);

    int updateByPrimaryKeySelective(ZxVersion record);

    int updateByPrimaryKey(ZxVersion record);
}