package com.antique.muzi.portal.service;


import com.antique.muzi.mbg.model.UmsMember;
import com.antique.muzi.portal.pojo.LoginDto;
import com.antique.muzi.portal.pojo.OpenIdJson;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;


public interface UmsMemberService {

    /**
     * 根据openid获取会员
     */
    UmsMember getByOpenid(String openid);

    //判断是否注册过
    UserDetails loadMemberByOpenId(String openid);

    //注册
    void register(Long id, String password,String nickname, String phone, Integer status, Date createTime, String avatarurl, Integer gender, String province, Integer orderCount);

    //获得openid
    OpenIdJson getOpenid(LoginDto loginDto) throws JsonProcessingException;


    //登录获取token
    String Login(String nickname,String openid) throws Exception;

    /**
     * 刷新token
     */
    String refreshToken(String token);

    /**
     * 获取当前登录会员
     */
    UmsMember getCurrentMember();
}
