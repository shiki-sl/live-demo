package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * <p>
 * 视频记录表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("log_user_video")
public class LogUserVideo extends Model<LogUserVideo> {

    private static final long serialVersionUID=1L;

    @TableField("log_id")
    private Integer logId;

    @TableField("video_id")
    private Integer videoId;

    @TableField("user_id")
    private Integer userId;

    @TableField("start_time")
    private LocalDateTime startTime;

    @TableField("end_time")
    private LocalDateTime endTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
