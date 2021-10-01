package com.antique.muzi.portal.controller;

import com.antique.muzi.common.api.CommonPage;
import com.antique.muzi.common.api.CommonResult;
import com.antique.muzi.mbg.model.CmsVideo;
import com.antique.muzi.portal.service.CmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(tags = "CmsController", description = "医院内容信息")
@Controller
@RequestMapping("/cms")
public class CmsController {

    @Autowired
    private CmsService cmsService;

    private static final Logger LOGGER= LoggerFactory.getLogger(CmsController.class);

    @ApiOperation(value = "按文章类型查找。可以查找关键字")
    @ApiImplicitParam(name = "type", value = "文章类型 1->精选文章 2->发现页文章 3->发现和精选都显示，4->科室导航，5->孕育百问百答",
            defaultValue = "1", allowableValues = "1,2,3,4,5", paramType = "query", dataType = "string")
    @RequestMapping(value = "/selectArticle", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult selectArticle(@RequestParam(required = false) String keyword,
                                      @RequestParam(required = true, defaultValue = "1") Integer pageNum,
                                      @RequestParam(required = true, defaultValue = "5") Integer pageSize,
                                      @RequestParam(required = true, defaultValue = "1") String type){
        return CommonResult.success(CommonPage.restPage(cmsService.selectArticleByType(type, keyword, pageNum, pageSize)));

    }

    @ApiOperation("获取文章详情")
    @RequestMapping(value = "getArticleDetail", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getArticleDetail(@RequestParam int id){
        return CommonResult.success(cmsService.getArticalDetail(id));
    }

    @ApiOperation("获取视频列表")
    @RequestMapping(value = "getVedioList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CmsVideo>> getVedioList() {
        return CommonResult.success(cmsService.getVideoList());
    }

    @ApiOperation("获取视频详情")
    @RequestMapping(value = "getVedioDetail", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getVedioDetail(@RequestParam int id){
        return CommonResult.success(cmsService.getVideoDetal(id));
    }

    @ApiOperation("获取医院信息")
    @RequestMapping(value = "getHosInfo", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getHosInfo(){
        return CommonResult.success(cmsService.getHosInfo());
    }

}
