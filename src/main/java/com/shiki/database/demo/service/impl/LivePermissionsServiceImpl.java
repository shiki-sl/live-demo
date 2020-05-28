package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.LivePermissions;
import com.shiki.database.demo.mapper.LivePermissionsMapper;
import com.shiki.database.demo.service.ILivePermissionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户权限中间表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class LivePermissionsServiceImpl extends ServiceImpl<LivePermissionsMapper, LivePermissions> implements ILivePermissionsService {

}
