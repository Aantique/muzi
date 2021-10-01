package com.antique.muzi.portal.controller;


import com.alibaba.fastjson.JSON;
import com.antique.muzi.common.api.CommonResult;
import com.antique.muzi.common.api.ResultCode;
import com.antique.muzi.common.util.RequestUtil;
import com.antique.muzi.mbg.mapper.UmsMemberLoginLogMapper;
import com.antique.muzi.mbg.model.UmsMember;
import com.antique.muzi.mbg.model.UmsMemberLoginLog;
import com.antique.muzi.portal.pojo.LoginDto;
import com.antique.muzi.portal.pojo.OpenIdJson;
import com.antique.muzi.portal.service.UmsMemberService;
import com.antique.muzi.portal.util.WechatDecryptDataUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.micrometer.core.instrument.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.Principal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 会员登录注册管理Controller
 * Created by macro on 2018/8/3.
 */
@Controller
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@RequestMapping("/sso")
public class UmsMemberController {

    private static final Logger logger = LoggerFactory.getLogger(UmsMemberController.class);

    @Resource
    private UmsMemberLoginLogMapper umsMemberLoginLogMapper;
    @Resource
    private UmsMemberService memberService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    private void insertLoginLog() {
        UmsMember member = memberService.getCurrentMember();
        UmsMemberLoginLog UserLog = new UmsMemberLoginLog();
        UserLog.setMemberId(member.getId());
        UserLog.setCreateTime(new Date());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        UserLog.setIp(RequestUtil.getRequestIp(request));
        UserLog.setCity(member.getProvince());

        umsMemberLoginLogMapper.insert(UserLog);
    }

    @ApiOperation("微信会员登录")
    @RequestMapping(value = "/weChatLogin", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Map<String, String>> userLogin(@RequestBody LoginDto loginDto) throws Exception {
        String token ="";
        //获取数据
        UmsMember member = JSON.parseObject(loginDto.getRawData(),UmsMember.class);
        OpenIdJson json = memberService.getOpenid(loginDto);
        if(memberService.getByOpenid(json.getOpenid()) ==null){
            memberService.register(member.getId(),json.getOpenid(),member.getNickname(),member.getPhone(),member.getStatus(),member.getCreateTime(),member.getAvatarurl(),member.getGender(),member.getProvince(),3);
        }
        token=memberService.Login(member.getNickname(),json.getOpenid());
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        tokenMap.put("sessionKey",json.getSession_key());
        insertLoginLog();
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取sessionKey")
    @RequestMapping(value = "/getSessionKey", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Map<String, String>> getSessionKey(@RequestBody String code) throws JsonProcessingException {
        LoginDto loginDto = new LoginDto();
        loginDto.setCode(code);
        OpenIdJson json = memberService.getOpenid(loginDto);
        Map<String, String> sessionkey = new HashMap<>();
        sessionkey.put("sessionKey",json.getSession_key());
        return CommonResult.success(sessionkey);
    }

    @ApiOperation(value = "刷新token")
    @RequestMapping(value = "/refreshToken", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Map<String, String>> refreshToken(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String refreshToken = memberService.refreshToken(token);
        if (refreshToken == null) {
            return CommonResult.failed("token已经过期！");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", refreshToken);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取会员信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult info(Principal principal) {
        if(principal==null){
            return CommonResult.unauthorized(null);
        }
        UmsMember member = memberService.getCurrentMember();
        return CommonResult.success(member);
    }

    @ApiOperation("获取手机号")
    @GetMapping("getPhone")
    @ResponseBody
    public CommonResult<String> getPhone(String encryptedData, String iv, String sessionKey) {
        if(StringUtils.isBlank(encryptedData)
                ||encryptedData.equals("undefined")
                ||StringUtils.isBlank(iv)
                ||iv.equals("undefined")
                ||StringUtils.isBlank(sessionKey)
                ||sessionKey.equals("undefined")) {
            return CommonResult.failed("参数错误！");
        }
        // 解码
/*        try {
            encryptedData = URLDecoder.decode(encryptedData,"UTF-8");
            sessionKey = URLDecoder.decode(sessionKey,"UTF-8");
            iv = URLDecoder.decode(iv,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.error("encryptedData，decode失败！", e);
            return CommonResult.failed("encryptedData，decode失败！");
        }*/
        String s = WechatDecryptDataUtil.decryptData(encryptedData, sessionKey, iv);
        if (s.isEmpty()) return CommonResult.failed("解码失败,请检查传输格式或重新登陆");
        return CommonResult.success(s);

    }

}
