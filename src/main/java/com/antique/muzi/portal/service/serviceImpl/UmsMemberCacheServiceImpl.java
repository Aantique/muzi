package com.antique.muzi.portal.service.serviceImpl;

import com.antique.muzi.common.service.RedisService;
import com.antique.muzi.mbg.mapper.UmsMemberMapper;
import com.antique.muzi.mbg.model.UmsMember;
import com.antique.muzi.portal.service.UmsMemberCacheService;
import com.antique.muzi.security.annotation.CacheException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsMemberCacheServiceImpl implements UmsMemberCacheService {

    @Autowired
    private RedisService redisService;
    @Autowired
    private UmsMemberMapper memberMapper;

    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.expire.token}")
    private Long REDIS_EXPIRE_TOKEN;
    @Value("${redis.key.member}")
    private String REDIS_KEY_MEMBER;
    @Value("${redis.key.token}")
    private String REDIS_KEY_TOKEN;

    @Override
    public void delMember(Long memberId) {
        UmsMember umsMember = memberMapper.selectByPrimaryKey(memberId);
        if (umsMember != null) {
            String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMBER + ":" + umsMember.getNickname();
            redisService.del(key);
        }
    }

    @Override
    public UmsMember getMember(String openid) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMBER + ":" + openid;
        return (UmsMember) redisService.get(key);
    }

    @Override
    public void setMember(UmsMember member) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_MEMBER + ":" + member.getPassword();
        redisService.set(key, member, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public void setToken(String telephone, String authCode) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_TOKEN + ":" + telephone;
        redisService.set(key, authCode, REDIS_EXPIRE_TOKEN);
    }

    @CacheException
    @Override
    public String getToken(String telephone) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_TOKEN + ":" + telephone;
        return (String) redisService.get(key);
    }
}
