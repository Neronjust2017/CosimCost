package com.njust.service.serviceImpl;

import com.njust.mapper.LlcParameterMapper;
import com.njust.mapper.LlcParameterMapper;
import com.njust.model.LlcParameter;
import com.njust.model.LlcParameterExample;
import com.njust.model.LlcParameter;
import com.njust.model.LlcParameter;
import com.njust.service.LlcParameter_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LlcParameter_ServiceImpl implements LlcParameter_Service {

    @Autowired
    LlcParameterMapper LlcParameterMapper;

    public long countByExample(LlcParameterExample example) {
        return LlcParameterMapper.countByExample(example);
    }

    public int deleteByExample(LlcParameterExample example) {
        return LlcParameterMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer parameterId) {
        return LlcParameterMapper.deleteByPrimaryKey(parameterId);
    }

    public int insert(LlcParameter record) {
        return LlcParameterMapper.insert(record);
    }

    public int insertSelective(LlcParameter record) {
        return LlcParameterMapper.insertSelective(record);
    }

    public List<LlcParameter> selectByExample(LlcParameterExample example) {
        return LlcParameterMapper.selectByExample(example);
    }

    public LlcParameter selectByPrimaryKey(Integer parameterId) {
        return LlcParameterMapper.selectByPrimaryKey(parameterId);
    }

    public int updateByExampleSelective(@Param("record") LlcParameter record, @Param("example") LlcParameterExample example) {
        return LlcParameterMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LlcParameter record, @Param("example") LlcParameterExample example) {
        return LlcParameterMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(LlcParameter record) {
        return LlcParameterMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LlcParameter record) {
        return LlcParameterMapper.updateByPrimaryKey(record);
    }
}
