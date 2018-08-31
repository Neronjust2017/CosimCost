package com.njust.mapper;

import com.njust.model.LlcTime;
import com.njust.model.LlcTimeExample;
import com.njust.model.LlcTimeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcTimeMapper {
    long countByExample(LlcTimeExample example);

    int deleteByExample(LlcTimeExample example);

    int deleteByPrimaryKey(LlcTimeKey key);

    int insert(LlcTime record);

    int insertSelective(LlcTime record);

    List<LlcTime> selectByExample(LlcTimeExample example);

    LlcTime selectByPrimaryKey(LlcTimeKey key);

    int updateByExampleSelective(@Param("record") LlcTime record, @Param("example") LlcTimeExample example);

    int updateByExample(@Param("record") LlcTime record, @Param("example") LlcTimeExample example);

    int updateByPrimaryKeySelective(LlcTime record);

    int updateByPrimaryKey(LlcTime record);
}