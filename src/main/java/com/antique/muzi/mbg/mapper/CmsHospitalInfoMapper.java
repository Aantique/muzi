package com.antique.muzi.mbg.mapper;

import com.antique.muzi.mbg.model.CmsHospitalInfo;
import com.antique.muzi.mbg.model.CmsHospitalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsHospitalInfoMapper {
    long countByExample(CmsHospitalInfoExample example);

    int deleteByExample(CmsHospitalInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsHospitalInfo record);

    int insertSelective(CmsHospitalInfo record);

    List<CmsHospitalInfo> selectByExample(CmsHospitalInfoExample example);

    CmsHospitalInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsHospitalInfo record, @Param("example") CmsHospitalInfoExample example);

    int updateByExample(@Param("record") CmsHospitalInfo record, @Param("example") CmsHospitalInfoExample example);

    int updateByPrimaryKeySelective(CmsHospitalInfo record);

    int updateByPrimaryKey(CmsHospitalInfo record);
}