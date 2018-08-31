package com.njust.service.serviceImpl;

import com.njust.mapper.LlcTechnologyMapper;
import com.njust.model.LlcTechnology;
import com.njust.model.LlcTechnologyExample;
import com.njust.model.LlcTechnologyKey;
import com.njust.service.LlcTechnology_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LlcTechnology_ServiceImpl implements LlcTechnology_Service {

    @Autowired
    LlcTechnologyMapper LlcTechnologyMapper;


    public long countByExample(LlcTechnologyExample example) {
        return LlcTechnologyMapper.countByExample(example);
    }

    public int deleteByExample(LlcTechnologyExample example) {
        return LlcTechnologyMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(LlcTechnologyKey key) {
        return LlcTechnologyMapper.deleteByPrimaryKey(key);
    }

    public int insert(LlcTechnology record) {
        return LlcTechnologyMapper.insert(record);
    }

    public int insertSelective(LlcTechnology record) {
        return LlcTechnologyMapper.insertSelective(record);
    }

    public List<LlcTechnology> selectByExample(LlcTechnologyExample example) {
        return LlcTechnologyMapper.selectByExample(example);
    }

    public LlcTechnology selectByPrimaryKey(LlcTechnologyKey key) {
        return LlcTechnologyMapper.selectByPrimaryKey(key);
    }

    public int updateByExampleSelective(@Param("record") LlcTechnology record, @Param("example") LlcTechnologyExample example) {
        return LlcTechnologyMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LlcTechnology record, @Param("example") LlcTechnologyExample example) {
        return LlcTechnologyMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(LlcTechnology record) {
        return LlcTechnologyMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LlcTechnology record) {
        return LlcTechnologyMapper.updateByPrimaryKey(record);
    }
}
