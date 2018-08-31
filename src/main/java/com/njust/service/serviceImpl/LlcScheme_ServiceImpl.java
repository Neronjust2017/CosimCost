package com.njust.service.serviceImpl;

import com.njust.mapper.LlcSchemeMapper;
import com.njust.model.LlcScheme;
import com.njust.model.LlcSchemeExample;
import com.njust.service.LlcScheme_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LlcScheme_ServiceImpl implements LlcScheme_Service {

    @Autowired
    LlcSchemeMapper LlcSchemeMapper;

    public long countByExample(LlcSchemeExample example) {
        return LlcSchemeMapper.countByExample(example);
    }


    public int deleteByExample(LlcSchemeExample example) {
        return LlcSchemeMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer schemeId) {
        return LlcSchemeMapper.deleteByPrimaryKey(schemeId);
    }

    public int insert(LlcScheme record) {
        return LlcSchemeMapper.insert(record);
    }

    public int insertSelective(LlcScheme record) {
        return LlcSchemeMapper.insertSelective(record);
    }

    public List<LlcScheme> selectByExample(LlcSchemeExample example) {
        return LlcSchemeMapper.selectByExample(example);
    }

    public LlcScheme selectByPrimaryKey(Integer schemeId) {
        return LlcSchemeMapper.selectByPrimaryKey(schemeId);
    }

    public int updateByExampleSelective(@Param("record") LlcScheme record, @Param("example") LlcSchemeExample example) {
        return updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LlcScheme record, @Param("example") LlcSchemeExample example) {
        return LlcSchemeMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(LlcScheme record) {
        return LlcSchemeMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LlcScheme record) {
        return LlcSchemeMapper.updateByPrimaryKey(record);
    }
}
