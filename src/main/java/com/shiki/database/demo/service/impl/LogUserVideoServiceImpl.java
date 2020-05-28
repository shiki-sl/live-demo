package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.LogUserVideo;
import com.shiki.database.demo.mapper.LogUserVideoMapper;
import com.shiki.database.demo.service.ILogUserVideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 视频记录表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class LogUserVideoServiceImpl extends ServiceImpl<LogUserVideoMapper, LogUserVideo> implements ILogUserVideoService {

}
