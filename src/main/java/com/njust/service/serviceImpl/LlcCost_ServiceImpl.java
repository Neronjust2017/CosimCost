package com.njust.service.serviceImpl;

import com.njust.mapper.LlcCostMapper;
import com.njust.model.LlcCost;
import com.njust.model.LlcCostExample;
import com.njust.model.LlcCostKey;
import com.njust.service.LlcCost_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LlcCost_ServiceImpl implements LlcCost_Service {

    @Autowired
    LlcCostMapper LlcCostMapper;

    public long countByExample(LlcCostExample example) {
        return LlcCostMapper.countByExample(example);
    }

    public int deleteByExample(LlcCostExample example) {
        return LlcCostMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(LlcCostKey key) {
        return LlcCostMapper.deleteByPrimaryKey(key);
    }

    public int insert(LlcCost record) {
        return LlcCostMapper.insert(record);
    }

    public int insertSelective(LlcCost record) {
        return LlcCostMapper.insertSelective(record);
    }

    public List<LlcCost> selectByExample(LlcCostExample example) {
        return LlcCostMapper.selectByExample(example);
    }

    public LlcCost selectByPrimaryKey(LlcCostKey key) {
        return LlcCostMapper.selectByPrimaryKey(key);
    }

    public int updateByExampleSelective(@Param("record") LlcCost record, @Param("example") LlcCostExample example) {
        return LlcCostMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LlcCost record, @Param("example") LlcCostExample example) {
        return LlcCostMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(LlcCost record) {
        return LlcCostMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LlcCost record) {
        return updateByPrimaryKey(record);
    }
}
