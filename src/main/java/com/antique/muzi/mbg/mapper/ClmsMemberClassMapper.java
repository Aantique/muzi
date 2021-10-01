package com.antique.muzi.mbg.mapper;

import com.antique.muzi.mbg.model.ClmsMemberClass;
import com.antique.muzi.mbg.model.ClmsMemberClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClmsMemberClassMapper {
    long countByExample(ClmsMemberClassExample example);

    int deleteByExample(ClmsMemberClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClmsMemberClass record);

    int insertSelective(ClmsMemberClass record);

    List<ClmsMemberClass> selectByExample(ClmsMemberClassExample example);

    ClmsMemberClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClmsMemberClass record, @Param("example") ClmsMemberClassExample example);

    int updateByExample(@Param("record") ClmsMemberClass record, @Param("example") ClmsMemberClassExample example);

    int updateByPrimaryKeySelective(ClmsMemberClass record);

    int updateByPrimaryKey(ClmsMemberClass record);
}