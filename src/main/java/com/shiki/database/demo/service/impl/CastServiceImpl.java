package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.Cast;
import com.shiki.database.demo.mapper.CastMapper;
import com.shiki.database.demo.service.ICastService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 直播的权限(嘉宾or主播) 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class CastServiceImpl extends ServiceImpl<CastMapper, Cast> implements ICastService {

}
