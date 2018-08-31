package com.njust.mapper;

import com.njust.model.LlcSvrTrainparams;
import com.njust.model.LlcSvrTrainparamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcSvrTrainparamsMapper {
    long countByExample(LlcSvrTrainparamsExample example);

    int deleteByExample(LlcSvrTrainparamsExample example);

    int insert(LlcSvrTrainparams record);

    int insertSelective(LlcSvrTrainparams record);

    List<LlcSvrTrainparams> selectByExample(LlcSvrTrainparamsExample example);

    int updateByExampleSelective(@Param("record") LlcSvrTrainparams record, @Param("example") LlcSvrTrainparamsExample example);

    int updateByExample(@Param("record") LlcSvrTrainparams record, @Param("example") LlcSvrTrainparamsExample example);
}