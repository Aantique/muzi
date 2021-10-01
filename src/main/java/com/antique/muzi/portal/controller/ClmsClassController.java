package com.antique.muzi.portal.controller;

import com.antique.muzi.common.api.CommonPage;
import com.antique.muzi.common.api.CommonResult;
import com.antique.muzi.mbg.model.ClmsClass;
import com.antique.muzi.portal.service.ClmsClassService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(tags = "ClmsController", description = "课程信息")
@Controller
@RequestMapping("/clms")
public class ClmsClassController {
    @Autowired
    private ClmsClassService classService;

    @ApiOperation("获取课程信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "type", value = "0-->线上；1-->线下;2-->全部",
                            defaultValue = "0", allowableValues = "0,1,2", paramType = "query", dataType = "integer")
            }
    )
    @RequestMapping(value = "getAllClass", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<ClmsClass>> getAllClass(@RequestParam(required = false, defaultValue = "0") Integer type){
        return CommonResult.success(classService.getAllClass(type));
    }

    @ApiOperation("预约课程")
    @RequestMapping(value = "subscribe", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> subscribe(@RequestParam int c_id){
        int result = classService.subscribeClass(c_id);
        if(result>0){
            return CommonResult.success("预约成功");
        }else return CommonResult.success("预约失败");
    }

    @ApiOperation("查看我的课程")
    @RequestMapping(value = "myClass", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<ClmsClass>> myClass(){
        List<ClmsClass> classListById = classService.getClassListById();
        return CommonResult.success(classListById);
    }

    @ApiOperation("查看课程详情")
    @RequestMapping(value = "getClassDetail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<ClmsClass>> getClassDetail(@RequestParam int id){
        return CommonResult.success(classService.getClassDetail(id));
    }

    @ApiOperation(value = "返回指定数目的课程")
    @RequestMapping(value = "/getClass", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<ClmsClass>> selectArticle(@RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                      @RequestParam(required = false, defaultValue = "5") Integer pageSize){
        return CommonResult.success(CommonPage.restPage(classService.getSpecifiedClass(pageNum,pageSize)));

    }


}
