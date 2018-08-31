package com.njust.service;

import com.njust.model.LlcSchemeCostDimension;
import com.njust.model.LlcSchemeCostDimensionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LlcSchemeCostDimension_Service {

    long countByExample(LlcSchemeCostDimensionExample example);

    int deleteByExample(LlcSchemeCostDimensionExample example);

    int insert(LlcSchemeCostDimension record);

    int insertSelective(LlcSchemeCostDimension record);

    List<LlcSchemeCostDimension> selectByExample(LlcSchemeCostDimensionExample example);

    int updateByExampleSelective(@Param("record") LlcSchemeCostDimension record, @Param("example") LlcSchemeCostDimensionExample example);

    int updateByExample(@Param("record") LlcSchemeCostDimension record, @Param("example") LlcSchemeCostDimensionExample example);
}
