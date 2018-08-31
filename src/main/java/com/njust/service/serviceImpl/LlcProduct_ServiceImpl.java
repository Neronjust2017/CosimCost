package com.njust.service.serviceImpl;

import com.njust.mapper.LlcProductMapper;
import com.njust.model.LlcProduct;
import com.njust.model.LlcProductExample;
import com.njust.model.LlcProductKey;
import com.njust.service.LlcProduct_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LlcProduct_ServiceImpl implements LlcProduct_Service {

    @Autowired
    LlcProductMapper LlcProductMapper;

    public long countByExample(LlcProductExample example) {
        return LlcProductMapper.countByExample(example);
    }

    public int deleteByExample(LlcProductExample example) {
        return LlcProductMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(LlcProductKey key) {
        return LlcProductMapper.deleteByPrimaryKey(key);
    }

    public int insert(LlcProduct record) {
        return LlcProductMapper.insert(record);
    }


    public int insertSelective(LlcProduct record) {
        return LlcProductMapper.insertSelective(record);
    }

    public List<LlcProduct> selectByExample(LlcProductExample example) {
        return LlcProductMapper.selectByExample(example);
    }

    public LlcProduct selectByPrimaryKey(LlcProductKey key) {
        return LlcProductMapper.selectByPrimaryKey(key);
    }

    public int updateByExampleSelective(@Param("record") LlcProduct record, @Param("example") LlcProductExample example) {
        return LlcProductMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LlcProduct record, @Param("example") LlcProductExample example) {
        return LlcProductMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(LlcProduct record) {
        return LlcProductMapper.updateByPrimaryKey(record);
    }

    public int updateByPrimaryKey(LlcProduct record) {
        return LlcProductMapper.updateByPrimaryKey(record);
    }
}
