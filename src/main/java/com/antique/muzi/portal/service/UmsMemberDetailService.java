package com.antique.muzi.portal.service;

import com.antique.muzi.mbg.model.UmsMemberDetail;

public interface UmsMemberDetailService {
    //获取用户详情
    UmsMemberDetail getMemberDeatil();

    //插入用户详情
    int addMemberDetail(UmsMemberDetail umsMemberDetail);

    //更新用户详情
    int updateMemberDetail(UmsMemberDetail umsMemberDetail);

    //判断是否有用户详情
    int memberDetailExist();

    //插入或更新
    int insertOrUpdate(UmsMemberDetail umsMemberDetail);

}
