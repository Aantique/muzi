package com.antique.muzi.mbg.mapper;

import com.antique.muzi.mbg.model.CmsVideo;
import com.antique.muzi.mbg.model.CmsVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsVideoMapper {
    long countByExample(CmsVideoExample example);

    int deleteByExample(CmsVideoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsVideo record);

    int insertSelective(CmsVideo record);

    List<CmsVideo> selectByExample(CmsVideoExample example);

    CmsVideo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsVideo record, @Param("example") CmsVideoExample example);

    int updateByExample(@Param("record") CmsVideo record, @Param("example") CmsVideoExample example);

    int updateByPrimaryKeySelective(CmsVideo record);

    int updateByPrimaryKey(CmsVideo record);
}