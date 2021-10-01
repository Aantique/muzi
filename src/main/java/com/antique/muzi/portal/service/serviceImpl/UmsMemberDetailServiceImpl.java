package com.antique.muzi.portal.service.serviceImpl;

import com.antique.muzi.mbg.mapper.UmsMemberDetailMapper;
import com.antique.muzi.mbg.model.UmsMember;
import com.antique.muzi.mbg.model.UmsMemberDetail;
import com.antique.muzi.mbg.model.UmsMemberDetailExample;
import com.antique.muzi.portal.service.UmsMemDetailCacheService;
import com.antique.muzi.portal.service.UmsMemberDetailService;
import com.antique.muzi.portal.service.UmsMemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UmsMemberDetailServiceImpl implements UmsMemberDetailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsMemberDetailServiceImpl.class);
    @Autowired
    private UmsMemberService umsMemberService;
    @Autowired
    private UmsMemberDetailMapper umsMemberDetailMapper;
    @Autowired
    private UmsMemDetailCacheService memDetailCacheService;


    @Override
    public UmsMemberDetail getMemberDeatil() {
        try {
            Long memberid = umsMemberService.getCurrentMember().getId();
            if (memDetailCacheService.getMemberDetail(memberid) !=null){
                return memDetailCacheService.getMemberDetail(memberid);
            }
            UmsMemberDetailExample example = new UmsMemberDetailExample();
            example.createCriteria().andMemIdEqualTo(memberid);
            umsMemberDetailMapper.selectByExample(example);
            if (!umsMemberDetailMapper.selectByExample(example).isEmpty()) return umsMemberDetailMapper.selectByExample(example).get(0);
        }catch (ClassCastException e){
            LOGGER.error("没有登录");
        } catch (NullPointerException e){
            LOGGER.error("没有登录，空指针异常");
        }
        return null;
    }

    @Override
    public int addMemberDetail(UmsMemberDetail umsMemberDetail) {
       if (getMemberDeatil() == null){
           try {
               Long memberid = umsMemberService.getCurrentMember().getId();
               umsMemberDetail.setMemId(memberid);
               umsMemberDetail.setCreateTime(new Date());
               umsMemberDetail.setUpdateTime(new Date());
               int insert = umsMemberDetailMapper.insert(umsMemberDetail);
               memDetailCacheService.setMemberDetail(umsMemberDetail);
               if (insert>0){
                   return insert;
               }
           }catch (ClassCastException e){
               LOGGER.error("没有登录");
           }
       }
        return 0;
    }

    @Override
    public int updateMemberDetail(UmsMemberDetail umsMemberDetail) {
        umsMemberDetail.setUpdateTime(new Date());
        if (umsMemberDetail.getId() == null || umsMemberDetail.getMemId() == null) return 0;
        int i = umsMemberDetailMapper.updateByPrimaryKey(umsMemberDetail);
        //System.out.println(i);
        if (i>0){
            memDetailCacheService.setMemberDetail(umsMemberDetail);
            return i;
        }
        return 0;
    }

    //存在返回1
    @Override
    public int memberDetailExist() {
        if (getMemberDeatil().getId() != null) return 1;
        return 0;
    }

    //不存在就添加
    @Override
    public int insertOrUpdate(UmsMemberDetail umsMemberDetail) {
        if (memberDetailExist() == 0) return addMemberDetail(umsMemberDetail);
        return updateMemberDetail(umsMemberDetail);
    }
}
