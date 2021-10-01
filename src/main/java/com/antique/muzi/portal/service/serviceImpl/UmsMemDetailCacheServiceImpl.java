package com.antique.muzi.portal.service.serviceImpl;

import com.antique.muzi.common.service.RedisService;
import com.antique.muzi.mbg.model.UmsMemberDetail;
import com.antique.muzi.portal.service.UmsMemDetailCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author songxuyang
 * @Date 2021/7/5 11:33
 * @Version 1.0
 */

@Service
public class UmsMemDetailCacheServiceImpl implements UmsMemDetailCacheService {

    @Autowired
    private RedisService redisService;

    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.memDetail}")
    private String REDIS_KEY_MEMDETAIL;

    @Override
    public UmsMemberDetail getMemberDetail(Long m_id) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMDETAIL + ":" + m_id;
        return (UmsMemberDetail) redisService.get(key);
    }

    @Override
    public void setMemberDetail(UmsMemberDetail memberDetail) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMDETAIL + ":" + memberDetail.getMemId();
        redisService.set(key,memberDetail,REDIS_EXPIRE);
    }

    @Override
    public void updateMemberDetail(UmsMemberDetail memberDetail) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMDETAIL + ":" + memberDetail.getMemId();
        redisService.set(key,memberDetail,REDIS_EXPIRE);
    }
}
