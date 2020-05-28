package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * <p>
 * 视频表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("video")
public class Video extends Model<Video> {

    private static final long serialVersionUID=1L;

    @TableId(value = "video_id", type = IdType.AUTO)
    private Integer videoId;

    /**
     * 剪辑视频所属栏目
     */
    @TableField("video_column_id")
    private Integer videoColumnId;

    /**
     * 剪辑视频名
     */
    @TableField("video_name")
    private String videoName;

    /**
     * 视频的一行简介
     */
    @TableField("video_title")
    private String videoTitle;

    /**
     * 图片
     */
    @TableField("video_img")
    private String videoImg;

    /**
     * 视频url
     */
    @TableField("video_url")
    private String videoUrl;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.videoId;
    }

}
