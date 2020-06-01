package com.shiki.database.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shiki.database.demo.common.core.util.R;
import com.shiki.database.demo.entity.Banner;

/**
 * <p>
 * 首页轮播图 服务类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
public interface
IBannerService extends IService<Banner> {

    /**
     * 缓存测试
     * @param page
     * @return
     */
    IPage<Banner> getBanner(IPage<Banner> page);

    String hello();
}
