package com.njust.mapper;

import com.njust.model.LlcNetMaxout;
import com.njust.model.LlcNetMaxoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcNetMaxoutMapper {
    long countByExample(LlcNetMaxoutExample example);

    int deleteByExample(LlcNetMaxoutExample example);

    int insert(LlcNetMaxout record);

    int insertSelective(LlcNetMaxout record);

    List<LlcNetMaxout> selectByExample(LlcNetMaxoutExample example);

    int updateByExampleSelective(@Param("record") LlcNetMaxout record, @Param("example") LlcNetMaxoutExample example);

    int updateByExample(@Param("record") LlcNetMaxout record, @Param("example") LlcNetMaxoutExample example);
}