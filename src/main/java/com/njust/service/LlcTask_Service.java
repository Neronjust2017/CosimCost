package com.njust.service;

import com.njust.model.LlcTask;
import com.njust.model.LlcTaskExample;
import com.njust.model.LlcTaskKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LlcTask_Service {

    long countByExample(LlcTaskExample example);

    int deleteByExample(LlcTaskExample example);

    int deleteByPrimaryKey(LlcTaskKey key);

    int insert(LlcTask record);

    int insertSelective(LlcTask record);

    List<LlcTask> selectByExample(LlcTaskExample example);

    LlcTask selectByPrimaryKey(LlcTaskKey key);

    int updateByExampleSelective(@Param("record") LlcTask record, @Param("example") LlcTaskExample example);

    int updateByExample(@Param("record") LlcTask record, @Param("example") LlcTaskExample example);

    int updateByPrimaryKeySelective(LlcTask record);

    int updateByPrimaryKey(LlcTask record);
}
