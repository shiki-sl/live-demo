package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
/**
 * <p>
 * 用户浏览历史
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("log_user_live")
public class LogUserLive extends Model<LogUserLive> {

    private static final long serialVersionUID=1L;

    @TableId(value = "log_id", type = IdType.AUTO)
    private Integer logId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 浏览历史直播id
     */
    @TableField("live_id")
    private Integer liveId;

    /**
     * 进入直播间时间
     */
    @TableField("start_time")
    private LocalDateTime startTime;

    /**
     * 用户上次观看视频时间
     */
    @TableField("end_time")
    private LocalTime endTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.logId;
    }

}
