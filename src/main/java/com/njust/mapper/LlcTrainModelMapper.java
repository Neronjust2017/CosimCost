package com.njust.mapper;

import com.njust.model.LlcTrainModel;
import com.njust.model.LlcTrainModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcTrainModelMapper {
    long countByExample(LlcTrainModelExample example);

    int deleteByExample(LlcTrainModelExample example);

    int insert(LlcTrainModel record);

    int insertSelective(LlcTrainModel record);

    List<LlcTrainModel> selectByExample(LlcTrainModelExample example);

    int updateByExampleSelective(@Param("record") LlcTrainModel record, @Param("example") LlcTrainModelExample example);

    int updateByExample(@Param("record") LlcTrainModel record, @Param("example") LlcTrainModelExample example);
}