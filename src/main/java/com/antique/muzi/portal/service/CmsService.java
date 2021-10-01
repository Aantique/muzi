package com.antique.muzi.portal.service;


import com.antique.muzi.mbg.model.CmsArticle;
import com.antique.muzi.mbg.model.CmsHospitalInfo;
import com.antique.muzi.mbg.model.CmsVideo;

import java.util.List;

public interface CmsService {

    //据类型查看文章查看文章
    List<CmsArticle> selectArticleByType(String type,String keyword, Integer pageNum, Integer pageSize);

    //获取文章详情
    List<CmsArticle> getArticalDetail(int id);

    //获取视频列表
    List<CmsVideo> getVideoList();

    //获取视频详情
    List<CmsVideo> getVideoDetal(int id);

    //获取医院详情
    CmsHospitalInfo getHosInfo();
}
