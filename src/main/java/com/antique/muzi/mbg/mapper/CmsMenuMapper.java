package com.antique.muzi.mbg.mapper;

import com.antique.muzi.mbg.model.CmsMenu;
import com.antique.muzi.mbg.model.CmsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMenuMapper {
    long countByExample(CmsMenuExample example);

    int deleteByExample(CmsMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsMenu record);

    int insertSelective(CmsMenu record);

    List<CmsMenu> selectByExample(CmsMenuExample example);

    CmsMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsMenu record, @Param("example") CmsMenuExample example);

    int updateByExample(@Param("record") CmsMenu record, @Param("example") CmsMenuExample example);

    int updateByPrimaryKeySelective(CmsMenu record);

    int updateByPrimaryKey(CmsMenu record);
}