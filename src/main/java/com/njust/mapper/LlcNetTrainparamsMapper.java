package com.njust.mapper;

import com.njust.model.LlcNetTrainparams;
import com.njust.model.LlcNetTrainparamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcNetTrainparamsMapper {
    long countByExample(LlcNetTrainparamsExample example);

    int deleteByExample(LlcNetTrainparamsExample example);

    int insert(LlcNetTrainparams record);

    int insertSelective(LlcNetTrainparams record);

    List<LlcNetTrainparams> selectByExample(LlcNetTrainparamsExample example);

    int updateByExampleSelective(@Param("record") LlcNetTrainparams record, @Param("example") LlcNetTrainparamsExample example);

    int updateByExample(@Param("record") LlcNetTrainparams record, @Param("example") LlcNetTrainparamsExample example);
}