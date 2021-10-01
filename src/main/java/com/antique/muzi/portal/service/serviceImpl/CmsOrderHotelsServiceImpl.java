package com.antique.muzi.portal.service.serviceImpl;

import com.antique.muzi.mbg.mapper.CmsOrderMaternityHotelsMapper;
import com.antique.muzi.mbg.model.CmsOrderMaternityHotels;
import com.antique.muzi.mbg.model.CmsOrderMaternityHotelsExample;
import com.antique.muzi.portal.service.CmsOrderHotelsService;
import com.antique.muzi.portal.service.UmsMemberDetailService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author songxuyang
 * @Date 2021/7/2 16:49
 * @Version 1.0
 */

@Service
public class CmsOrderHotelsServiceImpl implements CmsOrderHotelsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsOrderHotelsServiceImpl.class);

    @Autowired
    private CmsOrderMaternityHotelsMapper orderMaternityHotelsMapper;

    @Autowired
    private UmsMemberDetailService memberDetailService;

    private int member_detail_id;


    //预约月子中心
    @Override
    public int order() {
        int i = checkOrderById() ;
        if (i==1 || i ==0){
            CmsOrderMaternityHotels cmsOrderMaternityHotels = new CmsOrderMaternityHotels();
            try {
                cmsOrderMaternityHotels.setMemberDetailId(memberDetailService.getMemberDeatil().getId());
                cmsOrderMaternityHotels.setDeleteStatus(0);
                cmsOrderMaternityHotels.setCreateTime(new Date());
                cmsOrderMaternityHotels.setIsExpired(0);
            }catch (ClassCastException e){
                LOGGER.error("没有登陆");
            }
            return orderMaternityHotelsMapper.insert(cmsOrderMaternityHotels);
        }else return 0;
    }

    //检查是否有预约,且预约是否过期 ,
    @Override
    public int checkOrderById() {
        try {
            CmsOrderMaternityHotelsExample example = new CmsOrderMaternityHotelsExample();
            CmsOrderMaternityHotelsExample.Criteria criteria = example.createCriteria();
            criteria.andMemberDetailIdEqualTo(memberDetailService.getMemberDeatil().getId()).andDeleteStatusEqualTo(0);
            List<CmsOrderMaternityHotels> cmsOrderMaternityHotels  = orderMaternityHotelsMapper.selectByExample(example);
            if (cmsOrderMaternityHotels.isEmpty())
                return 0;
            criteria.andIsExpiredEqualTo(0);
            if (orderMaternityHotelsMapper.selectByExample(example).isEmpty())
                return 1;
            else
                return 2;
        }catch (ClassCastException e ){
            LOGGER.error("没有登陆");
        } catch (NullPointerException e){
            LOGGER.error("没有登录，空指针异常");
        }
        return 3;
    }

    //取消预约
    @Override
    public int cancelOrder() {
        if (checkOrderById() == 2) {
            CmsOrderMaternityHotelsExample example = new CmsOrderMaternityHotelsExample();
            //CmsOrderMaternityHotelsExample.Criteria criteria = new CmsOrderMaternityHotelsExample().createCriteria();
            try {
                example.createCriteria().andMemberDetailIdEqualTo(memberDetailService.getMemberDeatil().getId());
                return orderMaternityHotelsMapper.deleteByExample(example);
            }catch (ClassCastException e){
                LOGGER.error("没有登陆");
            } catch (NullPointerException e){
                LOGGER.error("没有登录，空指针异常");
            }
        }
        return 0;
    }

    //查看所有历史预约
    @Override
    public List<CmsOrderMaternityHotels> getAllOrder() {
        CmsOrderMaternityHotelsExample example = new CmsOrderMaternityHotelsExample();
        //CmsOrderMaternityHotelsExample.Criteria criteria = new CmsOrderMaternityHotelsExample().createCriteria();
        try {
            example.createCriteria().andMemberDetailIdEqualTo(memberDetailService.getMemberDeatil().getId()).andDeleteStatusEqualTo(0);
            return orderMaternityHotelsMapper.selectByExample(example);
        }catch (ClassCastException e){
            LOGGER.error("没有登陆");
        } catch (NullPointerException e){
            LOGGER.error("没有登录，空指针异常");
        }
        return null;
    }


}
