package com.njust.mapper;

import com.njust.model.HisSampleCost;
import com.njust.model.HisSampleCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisSampleCostMapper {
    long countByExample(HisSampleCostExample example);

    int deleteByExample(HisSampleCostExample example);

    int insert(HisSampleCost record);

    int insertSelective(HisSampleCost record);

    List<HisSampleCost> selectByExample(HisSampleCostExample example);

    int updateByExampleSelective(@Param("record") HisSampleCost record, @Param("example") HisSampleCostExample example);

    int updateByExample(@Param("record") HisSampleCost record, @Param("example") HisSampleCostExample example);
}