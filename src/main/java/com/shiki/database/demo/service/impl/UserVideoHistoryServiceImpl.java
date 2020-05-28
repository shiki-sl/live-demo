package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.UserVideoHistory;
import com.shiki.database.demo.mapper.UserVideoHistoryMapper;
import com.shiki.database.demo.service.IUserVideoHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户观看视频历史表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class UserVideoHistoryServiceImpl extends ServiceImpl<UserVideoHistoryMapper, UserVideoHistory> implements IUserVideoHistoryService {

}
