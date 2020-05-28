package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.LogUserLive;
import com.shiki.database.demo.mapper.LogUserLiveMapper;
import com.shiki.database.demo.service.ILogUserLiveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户浏览历史 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class LogUserLiveServiceImpl extends ServiceImpl<LogUserLiveMapper, LogUserLive> implements ILogUserLiveService {

}
