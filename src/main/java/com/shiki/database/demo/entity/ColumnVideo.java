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
 * 栏目直播中间鉴权表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("column_video")
public class ColumnVideo extends Model<ColumnVideo> {

    private static final long serialVersionUID=1L;

    @TableId(value = "column_video_id", type = IdType.AUTO)
    private Integer columnVideoId;

    /**
     * 视频id
     */
    @TableField("video_id")
    private Integer videoId;

    /**
     * 栏目id
     */
    @TableField("column_id")
    private Integer columnId;

    /**
     * 权限id
     */
    @TableField("permissions_id")
    private Integer permissionsId;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.columnVideoId;
    }

}
