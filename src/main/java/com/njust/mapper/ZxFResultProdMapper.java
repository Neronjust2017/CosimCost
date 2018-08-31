package com.njust.mapper;

import com.njust.model.ZxFResultProd;
import com.njust.model.ZxFResultProdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxFResultProdMapper {
    long countByExample(ZxFResultProdExample example);

    int deleteByExample(ZxFResultProdExample example);

    int insert(ZxFResultProd record);

    int insertSelective(ZxFResultProd record);

    List<ZxFResultProd> selectByExample(ZxFResultProdExample example);

    int updateByExampleSelective(@Param("record") ZxFResultProd record, @Param("example") ZxFResultProdExample example);

    int updateByExample(@Param("record") ZxFResultProd record, @Param("example") ZxFResultProdExample example);
}