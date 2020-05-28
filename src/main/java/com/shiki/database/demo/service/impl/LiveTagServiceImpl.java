package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.LiveTag;
import com.shiki.database.demo.mapper.LiveTagMapper;
import com.shiki.database.demo.service.ILiveTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 直播标签中间表,用于搜索 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class LiveTagServiceImpl extends ServiceImpl<LiveTagMapper, LiveTag> implements ILiveTagService {

}
