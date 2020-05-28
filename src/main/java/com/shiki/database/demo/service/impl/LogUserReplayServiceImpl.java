package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.LogUserReplay;
import com.shiki.database.demo.mapper.LogUserReplayMapper;
import com.shiki.database.demo.service.ILogUserReplayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 回放记录表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class LogUserReplayServiceImpl extends ServiceImpl<LogUserReplayMapper, LogUserReplay> implements ILogUserReplayService {

}
