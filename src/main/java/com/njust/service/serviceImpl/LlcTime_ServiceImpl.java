package com.njust.service.serviceImpl;

import com.njust.mapper.LlcTimeMapper;
import com.njust.model.LlcTime;
import com.njust.model.LlcTimeExample;
import com.njust.model.LlcTimeKey;
import com.njust.service.LlcTime_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LlcTime_ServiceImpl implements LlcTime_Service {

    @Autowired
    LlcTimeMapper LlcTimeMapper;

    public long countByExample(LlcTimeExample example) {
        return LlcTimeMapper.countByExample(example);
    }

    public int deleteByExample(LlcTimeExample example) {
        return LlcTimeMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(LlcTimeKey key) {
        return LlcTimeMapper.deleteByPrimaryKey(key);
    }

    public int insert(LlcTime record) {
        return LlcTimeMapper.insert(record);
    }

    public int insertSelective(LlcTime record) {
        return LlcTimeMapper.insertSelective(record);
    }

    public List<LlcTime> selectByExample(LlcTimeExample example) {
        return LlcTimeMapper.selectByExample(example);
    }

    public LlcTime selectByPrimaryKey(LlcTimeKey key) {
        return LlcTimeMapper.selectByPrimaryKey(key);
    }

    public int updateByExampleSelective(@Param("record") LlcTime record, @Param("example") LlcTimeExample example) {
        return LlcTimeMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LlcTime record, @Param("example") LlcTimeExample example) {
        return LlcTimeMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(LlcTime record) {
        return LlcTimeMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LlcTime record) {
        return LlcTimeMapper.updateByPrimaryKey(record);
    }
}
