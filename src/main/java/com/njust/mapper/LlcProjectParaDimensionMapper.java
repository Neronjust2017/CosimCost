package com.njust.mapper;

import com.njust.model.LlcProjectParaDimension;
import com.njust.model.LlcProjectParaDimensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcProjectParaDimensionMapper {
    long countByExample(LlcProjectParaDimensionExample example);

    int deleteByExample(LlcProjectParaDimensionExample example);

    int insert(LlcProjectParaDimension record);

    int insertSelective(LlcProjectParaDimension record);

    List<LlcProjectParaDimension> selectByExample(LlcProjectParaDimensionExample example);

    int updateByExampleSelective(@Param("record") LlcProjectParaDimension record, @Param("example") LlcProjectParaDimensionExample example);

    int updateByExample(@Param("record") LlcProjectParaDimension record, @Param("example") LlcProjectParaDimensionExample example);
}