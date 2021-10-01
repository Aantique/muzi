package com.antique.muzi.portal.service;

import com.antique.muzi.mbg.model.UmsMember;

public interface UmsMemberCacheService {
    /**
     * 删除会员用户缓存
     */
    void delMember(Long memberId);

    /**
     * 获取会员用户缓存
     */
    UmsMember getMember(String username);

    /**
     * 设置会员用户缓存
     */
    void setMember(UmsMember member);

    /**
     * 设置token
     */
    void setToken(String telephone, String authCode);

    /**
     * 获取token
     */
    String getToken(String telephone);
}
