package com.antique.muzi.portal.service;

import com.antique.muzi.mbg.model.ClmsClass;

import java.util.List;

public interface ClmsClassService {
    //获取所有课程
    List<ClmsClass> getAllClass(Integer type);

    //预约
    int subscribeClass(int c_id);

    //查看我的预约
    List<ClmsClass> getClassListById();

    //判断课程是否过期，存在或删除
    boolean checkClassById(int id);

    //根据id查看课程详情
    List<ClmsClass> getClassDetail(int id);

    //获取指定数量的接口
    List<ClmsClass> getSpecifiedClass(Integer pageNum, Integer pageSize);
}
