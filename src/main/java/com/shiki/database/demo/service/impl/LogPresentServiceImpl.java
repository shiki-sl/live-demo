package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.LogPresent;
import com.shiki.database.demo.mapper.LogPresentMapper;
import com.shiki.database.demo.service.ILogPresentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 主播礼物中间表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class LogPresentServiceImpl extends ServiceImpl<LogPresentMapper, LogPresent> implements ILogPresentService {

}
