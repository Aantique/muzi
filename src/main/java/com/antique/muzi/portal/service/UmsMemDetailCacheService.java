package com.antique.muzi.portal.service;

import com.antique.muzi.mbg.model.ClmsClass;
import com.antique.muzi.mbg.model.UmsMemberDetail;

import java.util.List;

/**
 * @Author songxuyang
 * @Date 2021/7/5 11:12
 * @Version 1.0
 */
public interface UmsMemDetailCacheService {
    //获取用户详情缓存
    UmsMemberDetail getMemberDetail(Long m_id);

    //设置用户详情缓存
    void setMemberDetail(UmsMemberDetail memberDetail);

    //更新用户详情缓存
     void updateMemberDetail(UmsMemberDetail memberDetail);
}
