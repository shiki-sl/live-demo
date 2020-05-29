package com.shiki.database.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shiki.database.demo.common.core.util.R;
import com.shiki.database.demo.entity.Banner;
import com.shiki.database.demo.mapper.BannerMapper;
import com.shiki.database.demo.service.IBannerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 首页轮播图 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@AllArgsConstructor
@Cacheable(cacheNames = "banner")
@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements IBannerService {

    @Cacheable(cacheNames = "banner", key = "'banner:current:'+#page.current+'size:'+#page.size")
    @Override
    public IPage<Banner> getBanner(Page<Banner> page) {
        log.debug("current:" + page.getCurrent() + "\n" + "size:" + page.getSize());
        return this.page(page);
    }

    private RedisTemplate redisTemplate;

    @Cacheable(cacheNames = "banner", key = "'hello'")
    @Override
    public String hello() {
        redisTemplate.expire("hello", 30, TimeUnit.SECONDS);
        return "hello";
    }
}
