package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.UserCollect;
import com.shiki.database.demo.mapper.UserCollectMapper;
import com.shiki.database.demo.service.IUserCollectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与直播关联表
 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class UserCollectServiceImpl extends ServiceImpl<UserCollectMapper, UserCollect> implements IUserCollectService {

}
