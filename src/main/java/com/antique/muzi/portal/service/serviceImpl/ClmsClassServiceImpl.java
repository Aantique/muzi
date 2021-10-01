package com.antique.muzi.portal.service.serviceImpl;

import com.antique.muzi.mbg.mapper.ClmsClassMapper;
import com.antique.muzi.mbg.mapper.ClmsMemberClassMapper;
import com.antique.muzi.mbg.model.*;
import com.antique.muzi.portal.service.ClmsClassService;
import com.antique.muzi.portal.service.UmsMemberService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class ClmsClassServiceImpl implements ClmsClassService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClmsClassServiceImpl.class);

    @Autowired
    private ClmsClassMapper clmsClassMapper;
    @Autowired
    private ClmsMemberClassMapper memberClassMapper;
    @Autowired
    private UmsMemberService memberService;


    //获取当前用户所有课程
    @Override
    public List<ClmsClass> getAllClass(Integer type) {
        ClmsClassExample classExample = new ClmsClassExample();
        if (type == 2){
            classExample.createCriteria().andDeleteStatusEqualTo(0);
        }else {
            classExample.createCriteria().andDeleteStatusEqualTo(0).andClassTypeEqualTo(type);
        }
        List<ClmsClass> clmsClasses = clmsClassMapper.selectByExample(classExample);
        clmsClasses.sort(Comparator.comparing(ClmsClass::getSort));
        ClmsMemberClassExample memberClassExample = new ClmsMemberClassExample();
        try {
            memberClassExample.createCriteria().andMIdEqualTo(memberService.getCurrentMember().getId());
            List<ClmsMemberClass> clmsMemberClasses = memberClassMapper.selectByExample(memberClassExample);
            for (ClmsClass clmsClass : clmsClasses) {
                for (ClmsMemberClass clmsMemberClass : clmsMemberClasses) {
                    if (clmsClass.getId() == clmsMemberClass.getcId()){
                        clmsClass.setIsSubscribe(1);
                    }
                }
            }
        }catch (ClassCastException e){
            LOGGER.error("没有登陆");
        }
        return clmsClasses;
    }

    //预约课程
    @Override
    public int subscribeClass(int c_id) {
       if (this.checkClassById(c_id)){
           ClmsMemberClass memberClass = new ClmsMemberClass();
           try {
               memberClass.setcId(c_id);
               memberClass.setmId(memberService.getCurrentMember().getId());
               memberClass.setDeleteStatus(0);
               System.out.println(memberClassMapper.insert(memberClass));
               return memberClassMapper.insert(memberClass);
           }catch (ClassCastException e){
            LOGGER.error("没有登陆");
        }
       }
       return 0;
    }


    //通过id查看我的课程
    @Override
    public List<ClmsClass> getClassListById() {
        ClmsMemberClassExample example = new ClmsMemberClassExample();
        example.createCriteria().andMIdEqualTo(memberService.getCurrentMember().getId()).andDeleteStatusEqualTo(0);
        List<ClmsMemberClass> clmsMemberClasses = memberClassMapper.selectByExample(example);
        if (clmsMemberClasses.isEmpty()){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        ClmsClassExample classExample = new ClmsClassExample();
        for (ClmsMemberClass memClass:clmsMemberClasses) {
            list.add(memClass.getcId());
        }
        classExample.createCriteria().andDeleteStatusEqualTo(0).andIdIn(list);
        return clmsClassMapper.selectByExample(classExample);
    }

    //检查课程是否存在
    @Override
    public boolean checkClassById(int id) {
        ClmsClassExample example = new ClmsClassExample();
        example.createCriteria().andDeleteStatusEqualTo(0).andIdEqualTo(id);
        if (!clmsClassMapper.selectByExample(example).isEmpty()){
            return true;
        }
        LOGGER.error("找不到课程");
        return false;
    }

    //获取课程详细信息
    @Override
    public List<ClmsClass> getClassDetail(int id) {
        ClmsClassExample example = new ClmsClassExample();
        example.createCriteria().andIdEqualTo(id).andDeleteStatusEqualTo(0);
        return clmsClassMapper.selectByExample(example);
    }

    @Override
    public List<ClmsClass> getSpecifiedClass(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        ClmsClassExample example = new ClmsClassExample();
        example.createCriteria().andDeleteStatusEqualTo(0).andClassTypeEqualTo(0);
        return clmsClassMapper.selectByExample(example);
    }
}
