package com.njust.mapper;

import com.njust.model.ZxVariable;
import com.njust.model.ZxVariableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxVariableMapper {
    long countByExample(ZxVariableExample example);

    int deleteByExample(ZxVariableExample example);

    int insert(ZxVariable record);

    int insertSelective(ZxVariable record);

    List<ZxVariable> selectByExample(ZxVariableExample example);

    int updateByExampleSelective(@Param("record") ZxVariable record, @Param("example") ZxVariableExample example);

    int updateByExample(@Param("record") ZxVariable record, @Param("example") ZxVariableExample example);
}