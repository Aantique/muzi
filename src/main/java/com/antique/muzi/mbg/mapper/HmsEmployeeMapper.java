package com.antique.muzi.mbg.mapper;

import com.antique.muzi.mbg.model.HmsEmployee;
import com.antique.muzi.mbg.model.HmsEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HmsEmployeeMapper {
    int countByExample(HmsEmployeeExample example);

    int deleteByExample(HmsEmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HmsEmployee record);

    int insertSelective(HmsEmployee record);

    List<HmsEmployee> selectByExample(HmsEmployeeExample example);

    HmsEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HmsEmployee record, @Param("example") HmsEmployeeExample example);

    int updateByExample(@Param("record") HmsEmployee record, @Param("example") HmsEmployeeExample example);

    int updateByPrimaryKeySelective(HmsEmployee record);

    int updateByPrimaryKey(HmsEmployee record);
}