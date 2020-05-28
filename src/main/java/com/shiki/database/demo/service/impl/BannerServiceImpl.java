package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.Banner;
import com.shiki.database.demo.mapper.BannerMapper;
import com.shiki.database.demo.service.IBannerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 首页轮播图 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements IBannerService {

}
