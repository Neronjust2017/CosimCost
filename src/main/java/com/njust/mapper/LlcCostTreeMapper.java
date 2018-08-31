package com.njust.mapper;

import com.njust.model.LlcCostTree;
import com.njust.model.LlcCostTreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcCostTreeMapper {
    long countByExample(LlcCostTreeExample example);

    int deleteByExample(LlcCostTreeExample example);

    int deleteByPrimaryKey(Integer costTreeId);

    int insert(LlcCostTree record);

    int insertSelective(LlcCostTree record);

    List<LlcCostTree> selectByExample(LlcCostTreeExample example);

    LlcCostTree selectByPrimaryKey(Integer costTreeId);

    int updateByExampleSelective(@Param("record") LlcCostTree record, @Param("example") LlcCostTreeExample example);

    int updateByExample(@Param("record") LlcCostTree record, @Param("example") LlcCostTreeExample example);

    int updateByPrimaryKeySelective(LlcCostTree record);

    int updateByPrimaryKey(LlcCostTree record);
}