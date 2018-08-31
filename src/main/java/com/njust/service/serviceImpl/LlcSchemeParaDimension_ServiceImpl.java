package com.njust.service.serviceImpl;

import com.njust.mapper.LlcSchemeParaDimensionMapper;
import com.njust.model.LlcSchemeParaDimension;
import com.njust.model.LlcSchemeParaDimensionExample;
import com.njust.service.LlcSchemeParaDimension_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LlcSchemeParaDimension_ServiceImpl implements LlcSchemeParaDimension_Service {

    @Autowired
    LlcSchemeParaDimensionMapper LlcSchemeParaDimensionMapper;

    public long countByExample(LlcSchemeParaDimensionExample example) {
        return LlcSchemeParaDimensionMapper.countByExample(example);
    }


    public int deleteByExample(LlcSchemeParaDimensionExample example) {
        return LlcSchemeParaDimensionMapper.deleteByExample(example);
    }

    public int insert(LlcSchemeParaDimension record) {
        return LlcSchemeParaDimensionMapper.insert(record);
    }

    public int insertSelective(LlcSchemeParaDimension record) {
        return LlcSchemeParaDimensionMapper.insertSelective(record);
    }

    public List<LlcSchemeParaDimension> selectByExample(LlcSchemeParaDimensionExample example) {
        return LlcSchemeParaDimensionMapper.selectByExample(example);
    }

    public int updateByExampleSelective(@Param("record") LlcSchemeParaDimension record, @Param("example") LlcSchemeParaDimensionExample example) {
        return LlcSchemeParaDimensionMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LlcSchemeParaDimension record, @Param("example") LlcSchemeParaDimensionExample example) {
        return LlcSchemeParaDimensionMapper.updateByExample(record, example);
    }
}
