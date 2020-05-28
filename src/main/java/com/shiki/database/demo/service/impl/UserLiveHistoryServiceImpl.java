package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.UserLiveHistory;
import com.shiki.database.demo.mapper.UserLiveHistoryMapper;
import com.shiki.database.demo.service.IUserLiveHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户观看直播统计表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class UserLiveHistoryServiceImpl extends ServiceImpl<UserLiveHistoryMapper, UserLiveHistory> implements IUserLiveHistoryService {

}
