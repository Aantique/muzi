package com.antique.muzi.portal.controller;

import com.antique.muzi.common.api.CommonResult;
import com.antique.muzi.mbg.model.CmsOrderMaternityHotels;
import com.antique.muzi.portal.service.CmsOrderHotelsService;
import com.antique.muzi.portal.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author songxuyang
 * @Date 2021/7/2 17:00
 * @Version 1.0
 */
@RequestMapping("/order")
@Api(tags = "CmsOrderHotelsController", description = "月子中心预约")
@Controller
public class CmsOrderHotelsController {

    @Autowired
    private CmsOrderHotelsService cmsOrderHotelsService;

    @ApiOperation("预约月子中心")
    @RequestMapping(value = "subscribe", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult order(){
        if (cmsOrderHotelsService.order() == 1){
            return CommonResult.success(cmsOrderHotelsService.order());
        }else return CommonResult.success("预约失败");

    }

    @ApiOperation("查看是否有预约")
    @GetMapping(value = "checkOrder")
    @ResponseBody
    public CommonResult checkOrder(){
        if (cmsOrderHotelsService.checkOrderById() == 2){
            return CommonResult.success("您已预约");
        }else if(cmsOrderHotelsService.checkOrderById() == 1 || cmsOrderHotelsService.checkOrderById()==0) return CommonResult.success("您还未预约");
        else return CommonResult.success("返回错误");
    }

    @ApiOperation("取消预约月子中心")
    @GetMapping(value = "cancelOrder")
    @ResponseBody
    public CommonResult cancel(){
        if (cmsOrderHotelsService.cancelOrder() == 1){
            return CommonResult.success(cmsOrderHotelsService.cancelOrder());
        }else return CommonResult.success("取消失败");
    }

    @ApiOperation("查看历史预约信息")
    @GetMapping(value = "getAllOrder")
    @ResponseBody
    public CommonResult getAll(){
        return CommonResult.success(cmsOrderHotelsService.getAllOrder());
    }
}
