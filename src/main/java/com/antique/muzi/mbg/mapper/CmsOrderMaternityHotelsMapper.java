package com.antique.muzi.mbg.mapper;

import com.antique.muzi.mbg.model.CmsOrderMaternityHotels;
import com.antique.muzi.mbg.model.CmsOrderMaternityHotelsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsOrderMaternityHotelsMapper {
    long countByExample(CmsOrderMaternityHotelsExample example);

    int deleteByExample(CmsOrderMaternityHotelsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsOrderMaternityHotels record);

    int insertSelective(CmsOrderMaternityHotels record);

    List<CmsOrderMaternityHotels> selectByExample(CmsOrderMaternityHotelsExample example);

    CmsOrderMaternityHotels selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsOrderMaternityHotels record, @Param("example") CmsOrderMaternityHotelsExample example);

    int updateByExample(@Param("record") CmsOrderMaternityHotels record, @Param("example") CmsOrderMaternityHotelsExample example);

    int updateByPrimaryKeySelective(CmsOrderMaternityHotels record);

    int updateByPrimaryKey(CmsOrderMaternityHotels record);
}