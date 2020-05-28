package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.ColumnVideo;
import com.shiki.database.demo.mapper.ColumnVideoMapper;
import com.shiki.database.demo.service.IColumnVideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 栏目直播中间鉴权表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class ColumnVideoServiceImpl extends ServiceImpl<ColumnVideoMapper, ColumnVideo> implements IColumnVideoService {

}
