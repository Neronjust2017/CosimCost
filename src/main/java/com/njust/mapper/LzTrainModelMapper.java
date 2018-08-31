package com.njust.mapper;

import com.njust.model.LzTrainModel;
import com.njust.model.LzTrainModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzTrainModelMapper {
    long countByExample(LzTrainModelExample example);

    int deleteByExample(LzTrainModelExample example);

    int deleteByPrimaryKey(String modelTime);

    int insert(LzTrainModel record);

    int insertSelective(LzTrainModel record);

    List<LzTrainModel> selectByExample(LzTrainModelExample example);

    LzTrainModel selectByPrimaryKey(String modelTime);

    int updateByExampleSelective(@Param("record") LzTrainModel record, @Param("example") LzTrainModelExample example);

    int updateByExample(@Param("record") LzTrainModel record, @Param("example") LzTrainModelExample example);

    int updateByPrimaryKeySelective(LzTrainModel record);

    int updateByPrimaryKey(LzTrainModel record);
}