package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 视频表
 * </p>
 *
 * @author shiki
 * @since 2020-06-02
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@TableName("video")
public class Video extends Model<Video> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 剪辑视频所属栏目
     */
    @TableField("column_id")
    private Long columnId;

    /**
     * 剪辑视频名
     */
    @TableField("title")
    private String title;

    /**
     * 视频的一行简介
     */
    @TableField("brief")
    private String brief;

    /**
     * 图片
     */
    @TableField("image")
    private String image;

    /**
     * 视频url
     */
    @TableField("url")
    private String url;

    /**
     * 0正常1删除
     */
    @TableField("is_del")
    @TableLogic
    private Boolean del;

    /**
     * 创建时间
     */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
