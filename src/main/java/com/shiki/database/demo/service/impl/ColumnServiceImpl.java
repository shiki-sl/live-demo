package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.Column;
import com.shiki.database.demo.mapper.ColumnMapper;
import com.shiki.database.demo.service.IColumnService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 栏目表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class ColumnServiceImpl extends ServiceImpl<ColumnMapper, Column> implements IColumnService {

}
