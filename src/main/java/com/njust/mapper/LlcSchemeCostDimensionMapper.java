package com.njust.mapper;

import com.njust.model.LlcSchemeCostDimension;
import com.njust.model.LlcSchemeCostDimensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcSchemeCostDimensionMapper {
    long countByExample(LlcSchemeCostDimensionExample example);

    int deleteByExample(LlcSchemeCostDimensionExample example);

    int insert(LlcSchemeCostDimension record);

    int insertSelective(LlcSchemeCostDimension record);

    List<LlcSchemeCostDimension> selectByExample(LlcSchemeCostDimensionExample example);

    int updateByExampleSelective(@Param("record") LlcSchemeCostDimension record, @Param("example") LlcSchemeCostDimensionExample example);

    int updateByExample(@Param("record") LlcSchemeCostDimension record, @Param("example") LlcSchemeCostDimensionExample example);
}