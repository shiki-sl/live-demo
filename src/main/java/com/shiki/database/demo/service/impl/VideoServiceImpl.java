package com.shiki.database.demo.service.impl;

import com.shiki.database.demo.entity.Video;
import com.shiki.database.demo.mapper.VideoMapper;
import com.shiki.database.demo.service.IVideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 视频表 服务实现类
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements IVideoService {

}
