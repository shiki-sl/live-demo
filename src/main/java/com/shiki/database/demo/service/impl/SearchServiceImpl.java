package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.Search;
import com.shiki.database.demo.mapper.SearchMapper;
import com.shiki.database.demo.service.ISearchService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 热搜表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class SearchServiceImpl extends ServiceImpl<SearchMapper, Search> implements ISearchService {

}
