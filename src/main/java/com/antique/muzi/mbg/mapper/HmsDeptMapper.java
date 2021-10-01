package com.antique.muzi.mbg.mapper;

import com.antique.muzi.mbg.model.HmsDept;
import com.antique.muzi.mbg.model.HmsDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HmsDeptMapper {
    int countByExample(HmsDeptExample example);

    int deleteByExample(HmsDeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HmsDept record);

    int insertSelective(HmsDept record);

    List<HmsDept> selectByExample(HmsDeptExample example);

    HmsDept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HmsDept record, @Param("example") HmsDeptExample example);

    int updateByExample(@Param("record") HmsDept record, @Param("example") HmsDeptExample example);

    int updateByPrimaryKeySelective(HmsDept record);

    int updateByPrimaryKey(HmsDept record);
}