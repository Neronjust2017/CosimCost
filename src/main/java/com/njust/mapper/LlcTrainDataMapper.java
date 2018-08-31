package com.njust.mapper;

import com.njust.model.LlcTrainData;
import com.njust.model.LlcTrainDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcTrainDataMapper {
    long countByExample(LlcTrainDataExample example);

    int deleteByExample(LlcTrainDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LlcTrainData record);

    int insertSelective(LlcTrainData record);

    List<LlcTrainData> selectByExample(LlcTrainDataExample example);

    LlcTrainData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LlcTrainData record, @Param("example") LlcTrainDataExample example);

    int updateByExample(@Param("record") LlcTrainData record, @Param("example") LlcTrainDataExample example);

    int updateByPrimaryKeySelective(LlcTrainData record);

    int updateByPrimaryKey(LlcTrainData record);
}