package com.njust.service.serviceImpl;

import com.njust.mapper.LlcTaskMapper;
import com.njust.model.LlcTask;
import com.njust.model.LlcTaskExample;
import com.njust.model.LlcTaskKey;
import com.njust.service.LlcTask_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LlcTask_ServiceImpl implements LlcTask_Service {

    @Autowired
    LlcTaskMapper LlcTaskMapper;

    public long countByExample(LlcTaskExample example) {
        return LlcTaskMapper.countByExample(example);
    }

    public int deleteByExample(LlcTaskExample example) {
        return LlcTaskMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(LlcTaskKey key) {
        return LlcTaskMapper.deleteByPrimaryKey(key);
    }

    public int insert(LlcTask record) {
        return LlcTaskMapper.insert(record);
    }

    public int insertSelective(LlcTask record) {
        return LlcTaskMapper.insertSelective(record);
    }

    public List<LlcTask> selectByExample(LlcTaskExample example) {
        return LlcTaskMapper.selectByExample(example);
    }

    public LlcTask selectByPrimaryKey(LlcTaskKey key) {
        return LlcTaskMapper.selectByPrimaryKey(key);
    }

    public int updateByExampleSelective(@Param("record") LlcTask record, @Param("example") LlcTaskExample example) {
        return LlcTaskMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LlcTask record, @Param("example") LlcTaskExample example) {
        return LlcTaskMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(LlcTask record) {
        return LlcTaskMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LlcTask record) {
        return LlcTaskMapper.updateByPrimaryKey(record);
    }
}
