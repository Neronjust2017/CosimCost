package com.njust.mapper;

import com.njust.model.LzOptVersion;
import com.njust.model.LzOptVersionExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzOptVersionMapper {
    long countByExample(LzOptVersionExample example);

    int deleteByExample(LzOptVersionExample example);

    int deleteByPrimaryKey(BigDecimal optId);

    int insert(LzOptVersion record);

    int insertSelective(LzOptVersion record);

    List<LzOptVersion> selectByExample(LzOptVersionExample example);

    LzOptVersion selectByPrimaryKey(BigDecimal optId);

    int updateByExampleSelective(@Param("record") LzOptVersion record, @Param("example") LzOptVersionExample example);

    int updateByExample(@Param("record") LzOptVersion record, @Param("example") LzOptVersionExample example);

    int updateByPrimaryKeySelective(LzOptVersion record);

    int updateByPrimaryKey(LzOptVersion record);
}