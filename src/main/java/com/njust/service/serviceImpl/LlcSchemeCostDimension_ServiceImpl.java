package com.njust.service.serviceImpl;

import com.njust.mapper.LlcSchemeCostDimensionMapper;
import com.njust.model.LlcSchemeCostDimension;
import com.njust.model.LlcSchemeCostDimensionExample;
import com.njust.service.LlcSchemeCostDimension_Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LlcSchemeCostDimension_ServiceImpl implements LlcSchemeCostDimension_Service {

    @Autowired
    LlcSchemeCostDimensionMapper LlcSchemeCostDimensionMapper;

    public long countByExample(LlcSchemeCostDimensionExample example) {
        return LlcSchemeCostDimensionMapper.countByExample(example);
    }

    public int deleteByExample(LlcSchemeCostDimensionExample example) {
        return LlcSchemeCostDimensionMapper.deleteByExample(example);
    }

    public int insert(LlcSchemeCostDimension record) {
        return LlcSchemeCostDimensionMapper.insert(record);
    }

    public int insertSelective(LlcSchemeCostDimension record) {
        return LlcSchemeCostDimensionMapper.insertSelective(record);
    }

    public List<LlcSchemeCostDimension> selectByExample(LlcSchemeCostDimensionExample example) {
        return LlcSchemeCostDimensionMapper.selectByExample(example);
    }

    public int updateByExampleSelective(@Param("record") LlcSchemeCostDimension record, @Param("example") LlcSchemeCostDimensionExample example) {
        return LlcSchemeCostDimensionMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(@Param("record") LlcSchemeCostDimension record, @Param("example") LlcSchemeCostDimensionExample example) {
        return LlcSchemeCostDimensionMapper.updateByExample(record, example);
    }
}
