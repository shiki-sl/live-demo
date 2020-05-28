package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.Live;
import com.shiki.database.demo.mapper.LiveMapper;
import com.shiki.database.demo.service.ILiveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 直播表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class LiveServiceImpl extends ServiceImpl<LiveMapper, Live> implements ILiveService {

}
