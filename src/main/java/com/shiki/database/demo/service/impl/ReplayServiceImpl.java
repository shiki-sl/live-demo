package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.Replay;
import com.shiki.database.demo.mapper.ReplayMapper;
import com.shiki.database.demo.service.IReplayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 回放表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class ReplayServiceImpl extends ServiceImpl<ReplayMapper, Replay> implements IReplayService {

}
