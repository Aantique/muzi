package com.antique.muzi.mbg.mapper;

import com.antique.muzi.mbg.model.UmsMemberDetail;
import com.antique.muzi.mbg.model.UmsMemberDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberDetailMapper {
    long countByExample(UmsMemberDetailExample example);

    int deleteByExample(UmsMemberDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsMemberDetail record);

    int insertSelective(UmsMemberDetail record);

    List<UmsMemberDetail> selectByExample(UmsMemberDetailExample example);

    UmsMemberDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsMemberDetail record, @Param("example") UmsMemberDetailExample example);

    int updateByExample(@Param("record") UmsMemberDetail record, @Param("example") UmsMemberDetailExample example);

    int updateByPrimaryKeySelective(UmsMemberDetail record);

    int updateByPrimaryKey(UmsMemberDetail record);
}