package com.njust.mapper;

import com.njust.model.ZxFResultSta;
import com.njust.model.ZxFResultStaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZxFResultStaMapper {
    long countByExample(ZxFResultStaExample example);

    int deleteByExample(ZxFResultStaExample example);

    int insert(ZxFResultSta record);

    int insertSelective(ZxFResultSta record);

    List<ZxFResultSta> selectByExample(ZxFResultStaExample example);

    int updateByExampleSelective(@Param("record") ZxFResultSta record, @Param("example") ZxFResultStaExample example);

    int updateByExample(@Param("record") ZxFResultSta record, @Param("example") ZxFResultStaExample example);
}