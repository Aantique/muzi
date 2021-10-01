package com.antique.muzi.portal.service.serviceImpl;

import com.antique.muzi.common.api.CommonResult;
import com.antique.muzi.mbg.mapper.UmsMemberMapper;
import com.antique.muzi.mbg.model.UmsMember;
import com.antique.muzi.mbg.model.UmsMemberExample;
import com.antique.muzi.portal.pojo.LoginDto;
import com.antique.muzi.portal.pojo.MemberDetail;
import com.antique.muzi.portal.pojo.OpenIdJson;
import com.antique.muzi.portal.service.UmsMemberCacheService;
import com.antique.muzi.portal.service.UmsMemberService;
import com.antique.muzi.portal.util.HttpUtil;
import com.antique.muzi.security.util.JwtTokenUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsMemberServiceImpl.class);
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UmsMemberCacheService memberCacheService;
    @Autowired
    private UmsMemberMapper memberMapper;
    @Resource
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Value("${wechat.appid}")
    private String appID;
    @Value("${wechat.secret}")
    private String appSecret ;

    @Override
    public UmsMember getByOpenid(String openid) {
        UmsMember member = memberCacheService.getMember(openid);
        if (member != null) return member;
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andPasswordEqualTo(openid);
        List<UmsMember> memberList = memberMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(memberList)) {
            member = memberList.get(0);
            memberCacheService.setMember(member);
            return member;
        }
        return null;
    }

    @Override
    public UserDetails loadMemberByOpenId(String openid) {
        UmsMember member = getByOpenid(openid);
        if (member != null) {
            return new MemberDetail(member);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    @Override
    public void register(Long id, String password, String nickname, String phone, Integer status, Date createTime, String avatarurl, Integer gender, String province, Integer orderCount) {
        //没有该用户进行添加操作
        UmsMember umsMember = new UmsMember();
        umsMember.setNickname(nickname);
        umsMember.setPhone(phone);
        umsMember.setPassword(password);
        umsMember.setGender(1);
        umsMember.setProvince(province);
        umsMember.setAvatarurl(avatarurl);
        umsMember.setCreateTime(new Date());
        //默认设置
        umsMember.setStatus(1);
        //umsMember.setLuckeyCount(1);//剩余抽奖数
        //获取默认会员等级并设置
        memberMapper.insert(umsMember);
        //System.out.println("插入");
    }



    @Override
    public String refreshToken(String token) {
        return jwtTokenUtil.refreshHeadToken(token);
    }

    @Override
    public UmsMember getCurrentMember() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        MemberDetail memberDetail = (MemberDetail) auth.getPrincipal();
        return  memberDetail.getUmsMember();
    }


    @Override
    public OpenIdJson getOpenid(LoginDto loginDto) throws JsonProcessingException {
        String result = "";
        try{//请求微信服务器，用code换取openid。HttpUtil是工具类，后面会给出实现，Configure类是小程序配置信息，后面会给出代码
            result = HttpUtil.doGet(
                    "https://api.weixin.qq.com/sns/jscode2session?appid="
                            + this.appID + "&secret="
                            + this.appSecret + "&js_code="
                            + loginDto.getCode()
                            + "&grant_type=authorization_code", null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        //System.out.println("openid:"+openIdJson.getOpenid());
        assert result != null;
        return mapper.readValue(result, OpenIdJson.class);
    }



    @Override
    public String Login(String nickname,String password) throws Exception {
        String token = null;
        //密码需要客户端加密后传递
        try {
            UserDetails userDetails = loadMemberByOpenId(password);
            //System.out.println("Login " + userDetails.getPassword());
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }


}
