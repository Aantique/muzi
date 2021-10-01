package com.antique.muzi.portal.controller;


import com.antique.muzi.common.api.CommonResult;
import com.antique.muzi.mbg.model.UmsMemberDetail;
import com.antique.muzi.portal.service.UmsMemberDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(tags = "UmsMemberDetailController", description = "用户详情信息")
@Controller
@RequestMapping("/umsdetail")
public class UmsMemberDetailController {
    @Autowired
    private UmsMemberDetailService umsMemberDetailService;

    @ApiOperation("查看会员详情")
    @RequestMapping(value = "/getMemberDetail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getMemberDeail(){
        return CommonResult.success(umsMemberDetailService.getMemberDeatil());
    }

    @ApiOperation("新增会员详情")
    @RequestMapping(value = "/addMemberDetail", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addMemberDeail(@RequestBody UmsMemberDetail umsMemberDetail){
        int i = umsMemberDetailService.addMemberDetail(umsMemberDetail);
        if(i>0){
            return CommonResult.success(i);
        }
        return CommonResult.failed();
    }

    @ApiOperation("更新会员详情")
    @RequestMapping(value = "/updateMemberDetail", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMemberDeail(@RequestBody UmsMemberDetail umsMemberDetail){
        int i = umsMemberDetailService.updateMemberDetail(umsMemberDetail);
        if(i>0){
            return CommonResult.success(i);
        }
        return CommonResult.failed();
    }

    @ApiOperation("是否存在会员详情,1存在0不存在")
    @RequestMapping(value = "/memberDetailExist", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult updateMemberDetail(){
        int i = umsMemberDetailService.memberDetailExist();
        if(i>0){
            return CommonResult.success(i);
        }
        return CommonResult.success(0);
    }

    @ApiOperation("更新或插入会员详情,1更新成功0更新失败")
    @RequestMapping(value = "/insertOrUpdate", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertOrUpdate(@RequestBody UmsMemberDetail umsMemberDetail){
        int i = umsMemberDetailService.insertOrUpdate(umsMemberDetail);
        return CommonResult.success(i);
    }
}
