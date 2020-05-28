package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.Tag;
import com.shiki.database.demo.mapper.TagMapper;
import com.shiki.database.demo.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 直播标签表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
