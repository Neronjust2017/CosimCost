package com.njust.mapper;

import com.njust.model.ZxProd;
import com.njust.model.ZxProdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxProdMapper {
    long countByExample(ZxProdExample example);

    int deleteByExample(ZxProdExample example);

    int insert(ZxProd record);

    int insertSelective(ZxProd record);

    List<ZxProd> selectByExample(ZxProdExample example);

    int updateByExampleSelective(@Param("record") ZxProd record, @Param("example") ZxProdExample example);

    int updateByExample(@Param("record") ZxProd record, @Param("example") ZxProdExample example);
}