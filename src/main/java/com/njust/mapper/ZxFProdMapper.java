package com.njust.mapper;

import com.njust.model.ZxFProd;
import com.njust.model.ZxFProdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxFProdMapper {
    long countByExample(ZxFProdExample example);

    int deleteByExample(ZxFProdExample example);

    int insert(ZxFProd record);

    int insertSelective(ZxFProd record);

    List<ZxFProd> selectByExample(ZxFProdExample example);

    int updateByExampleSelective(@Param("record") ZxFProd record, @Param("example") ZxFProdExample example);

    int updateByExample(@Param("record") ZxFProd record, @Param("example") ZxFProdExample example);
}