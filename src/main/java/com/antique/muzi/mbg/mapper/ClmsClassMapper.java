package com.antique.muzi.mbg.mapper;

import com.antique.muzi.mbg.model.ClmsClass;
import com.antique.muzi.mbg.model.ClmsClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClmsClassMapper {
    long countByExample(ClmsClassExample example);

    int deleteByExample(ClmsClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClmsClass record);

    int insertSelective(ClmsClass record);

    List<ClmsClass> selectByExample(ClmsClassExample example);

    ClmsClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClmsClass record, @Param("example") ClmsClassExample example);

    int updateByExample(@Param("record") ClmsClass record, @Param("example") ClmsClassExample example);

    int updateByPrimaryKeySelective(ClmsClass record);

    int updateByPrimaryKey(ClmsClass record);
}