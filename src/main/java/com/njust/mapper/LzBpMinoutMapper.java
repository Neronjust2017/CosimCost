package com.njust.mapper;

import com.njust.model.LzBpMinout;
import com.njust.model.LzBpMinoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LzBpMinoutMapper {
    long countByExample(LzBpMinoutExample example);

    int deleteByExample(LzBpMinoutExample example);

    int insert(LzBpMinout record);

    int insertSelective(LzBpMinout record);

    List<LzBpMinout> selectByExample(LzBpMinoutExample example);

    int updateByExampleSelective(@Param("record") LzBpMinout record, @Param("example") LzBpMinoutExample example);

    int updateByExample(@Param("record") LzBpMinout record, @Param("example") LzBpMinoutExample example);
}