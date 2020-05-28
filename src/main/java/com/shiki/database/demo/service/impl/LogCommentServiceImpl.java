package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.LogComment;
import com.shiki.database.demo.mapper.LogCommentMapper;
import com.shiki.database.demo.service.ILogCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 直播评论表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class LogCommentServiceImpl extends ServiceImpl<LogCommentMapper, LogComment> implements ILogCommentService {

}
