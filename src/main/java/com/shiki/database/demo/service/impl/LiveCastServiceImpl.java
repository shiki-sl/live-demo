package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.LiveCast;
import com.shiki.database.demo.mapper.LiveCastMapper;
import com.shiki.database.demo.service.ILiveCastService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 嘉宾直播关联表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class LiveCastServiceImpl extends ServiceImpl<LiveCastMapper, LiveCast> implements ILiveCastService {

}
