package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.Present;
import com.shiki.database.demo.mapper.PresentMapper;
import com.shiki.database.demo.service.IPresentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 直播礼物表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class PresentServiceImpl extends ServiceImpl<PresentMapper, Present> implements IPresentService {

}
