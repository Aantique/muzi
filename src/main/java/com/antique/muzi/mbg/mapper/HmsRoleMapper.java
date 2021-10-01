package com.antique.muzi.mbg.mapper;

import com.antique.muzi.mbg.model.HmsRole;
import com.antique.muzi.mbg.model.HmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HmsRoleMapper {
    int countByExample(HmsRoleExample example);

    int deleteByExample(HmsRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HmsRole record);

    int insertSelective(HmsRole record);

    List<HmsRole> selectByExample(HmsRoleExample example);

    HmsRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HmsRole record, @Param("example") HmsRoleExample example);

    int updateByExample(@Param("record") HmsRole record, @Param("example") HmsRoleExample example);

    int updateByPrimaryKeySelective(HmsRole record);

    int updateByPrimaryKey(HmsRole record);
}