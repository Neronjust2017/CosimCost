package com.njust.service.serviceImpl;

import com.njust.mapper.LlcResourceMapper;
import com.njust.model.LlcResource;
import com.njust.model.LlcResourceExample;
import com.njust.model.LlcResourceKey;
import com.njust.service.LlcResource_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LlcResource_ServiceImpl implements LlcResource_Service {

    @Autowired
    LlcResourceMapper LlcResourceMapper;

    public long countByExample(LlcResourceExample example) {
        return LlcResourceMapper.countByExample(example);
    }

    public int deleteByExample(LlcResourceExample example) {
        return LlcResourceMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(LlcResourceKey key) {
        return LlcResourceMapper.deleteByPrimaryKey(key);
    }

    public int insert(LlcResource record) {
        return LlcResourceMapper.insert(record);
    }

    public int insertSelective(LlcResource record) {
        return LlcResourceMapper.insertSelective(record);
    }

    public List<LlcResource> selectByExample(LlcResourceExample example) {
        return LlcResourceMapper.selectByExample(example);
    }

    public LlcResource selectByPrimaryKey(LlcResourceKey key) {
        return LlcResourceMapper.selectByPrimaryKey(key);
    }

    public int updateByExampleSelective(@Param("record") LlcResource record, @Param("example") LlcResourceExample example) {
        return LlcResourceMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LlcResource record, @Param("example") LlcResourceExample example) {
        return LlcResourceMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(LlcResource record) {
        return LlcResourceMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LlcResource record) {
        return LlcResourceMapper.updateByPrimaryKey(record);
    }
}
