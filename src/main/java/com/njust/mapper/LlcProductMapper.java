package com.njust.mapper;

import com.njust.model.LlcProduct;
import com.njust.model.LlcProductExample;
import com.njust.model.LlcProductKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcProductMapper {
    long countByExample(LlcProductExample example);

    int deleteByExample(LlcProductExample example);

    int deleteByPrimaryKey(LlcProductKey key);

    int insert(LlcProduct record);

    int insertSelective(LlcProduct record);

    List<LlcProduct> selectByExample(LlcProductExample example);

    LlcProduct selectByPrimaryKey(LlcProductKey key);

    int updateByExampleSelective(@Param("record") LlcProduct record, @Param("example") LlcProductExample example);

    int updateByExample(@Param("record") LlcProduct record, @Param("example") LlcProductExample example);

    int updateByPrimaryKeySelective(LlcProduct record);

    int updateByPrimaryKey(LlcProduct record);
}