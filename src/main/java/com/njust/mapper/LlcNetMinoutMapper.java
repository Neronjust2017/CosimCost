package com.njust.mapper;

import com.njust.model.LlcNetMinout;
import com.njust.model.LlcNetMinoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlcNetMinoutMapper {
    long countByExample(LlcNetMinoutExample example);

    int deleteByExample(LlcNetMinoutExample example);

    int insert(LlcNetMinout record);

    int insertSelective(LlcNetMinout record);

    List<LlcNetMinout> selectByExample(LlcNetMinoutExample example);

    int updateByExampleSelective(@Param("record") LlcNetMinout record, @Param("example") LlcNetMinoutExample example);

    int updateByExample(@Param("record") LlcNetMinout record, @Param("example") LlcNetMinoutExample example);
}