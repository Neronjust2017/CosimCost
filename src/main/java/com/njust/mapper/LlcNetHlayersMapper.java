package com.njust.mapper;

import com.njust.model.LlcNetHlayers;
import com.njust.model.LlcNetHlayersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcNetHlayersMapper {
    long countByExample(LlcNetHlayersExample example);

    int deleteByExample(LlcNetHlayersExample example);

    int insert(LlcNetHlayers record);

    int insertSelective(LlcNetHlayers record);

    List<LlcNetHlayers> selectByExample(LlcNetHlayersExample example);

    int updateByExampleSelective(@Param("record") LlcNetHlayers record, @Param("example") LlcNetHlayersExample example);

    int updateByExample(@Param("record") LlcNetHlayers record, @Param("example") LlcNetHlayersExample example);
}