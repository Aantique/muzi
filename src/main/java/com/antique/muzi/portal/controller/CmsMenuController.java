package com.antique.muzi.portal.controller;

import com.antique.muzi.common.api.CommonResult;
import com.antique.muzi.portal.service.CmsMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "CmsMenuController", description = "首页菜单信息")
@Controller
@RequestMapping("/cmsmenu")
public class CmsMenuController {

    @Autowired
    private CmsMenuService cmsMenuService;

    @ApiOperation("获取一级菜单列表")
    @RequestMapping(value = "getFirstLevel", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getFirstLevel(){
        return CommonResult.success(cmsMenuService.getFirstLevel());
    }

    @ApiOperation("获取二级菜单")
    @RequestMapping(value = "getSecondLevel", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getSecondLevel(@RequestParam(required = true) Long id){
        return CommonResult.success(cmsMenuService.getSecondLevel(id));
    }
}
