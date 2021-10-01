package com.antique.muzi.portal.service.serviceImpl;

import cn.hutool.core.util.StrUtil;
import com.antique.muzi.mbg.mapper.CmsArticleMapper;
import com.antique.muzi.mbg.mapper.CmsHospitalInfoMapper;
import com.antique.muzi.mbg.mapper.CmsVideoMapper;
import com.antique.muzi.mbg.model.*;
import com.antique.muzi.portal.service.CmsService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CmsServiceImpl implements CmsService {

    @Autowired
    private CmsArticleMapper articleMapper;
    @Autowired
    private CmsVideoMapper videoMapper;
    @Autowired
    private CmsHospitalInfoMapper hospitalInfoMapper;

   //CmsArticleExample articleExample = new CmsArticleExample();

    //CmsVedioExample vedioExample = new CmsVedioExample();

    //按条件筛选文章
    @Override
    public List<CmsArticle> selectArticleByType(String type, String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        CmsArticleExample articleExample = new CmsArticleExample();
        CmsArticleExample.Criteria criteria = articleExample.createCriteria();
        if(StrUtil.isNotEmpty(keyword)){
            criteria.andTitleLike("%" + keyword + "%");
        }
        criteria.andDeleteStatusEqualTo(0);
        if (type.equals("1")){
            List<String> list = Arrays.asList(type,"3");
            criteria.andTypeIn(list);
        }else if (type.equals("2")){
            List<String> list = Arrays.asList(type,"3");
            criteria.andTypeIn(list);
        }else criteria.andTypeEqualTo(type);
        List<CmsArticle> list = articleMapper.selectByExample(articleExample);
        list.sort(Comparator.comparing(CmsArticle::getSort));
        return list;
    }

    @Override
    public List<CmsArticle> getArticalDetail(int id) {
        CmsArticleExample articleExample = new CmsArticleExample();
        articleExample.createCriteria().andDeleteStatusEqualTo(0).andIdEqualTo(id);
        return articleMapper.selectByExample(articleExample);
    }

    @Override
    public List<CmsVideo> getVideoList() {
        CmsVideoExample videoExample = new CmsVideoExample();
        videoExample.createCriteria().andDeleteStatusEqualTo(0);
        return videoMapper.selectByExample(videoExample);
    }

    @Override
    public List<CmsVideo> getVideoDetal(int id) {
        CmsVideoExample videoExample = new CmsVideoExample();
        videoExample.createCriteria().andDeleteStatusEqualTo(0).andIdEqualTo(id);
        return videoMapper.selectByExample(videoExample);
    }

    @Override
    public CmsHospitalInfo getHosInfo() {
        return hospitalInfoMapper.selectByPrimaryKey(1);
    }
}
