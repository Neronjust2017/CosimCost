package com.njust.mapper;

import com.njust.model.LlcNetMaxin;
import com.njust.model.LlcNetMaxinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcNetMaxinMapper {
    long countByExample(LlcNetMaxinExample example);

    int deleteByExample(LlcNetMaxinExample example);

    int insert(LlcNetMaxin record);

    int insertSelective(LlcNetMaxin record);

    List<LlcNetMaxin> selectByExample(LlcNetMaxinExample example);

    int updateByExampleSelective(@Param("record") LlcNetMaxin record, @Param("example") LlcNetMaxinExample example);

    int updateByExample(@Param("record") LlcNetMaxin record, @Param("example") LlcNetMaxinExample example);
}