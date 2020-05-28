package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * 用户观看直播统计表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("user_live_history")
public class UserLiveHistory extends Model<UserLiveHistory> {

    private static final long serialVersionUID=1L;

    /**
     * 用户观看直播历史id
     */
    @TableId(value = "history_id", type = IdType.AUTO)
    private Integer historyId;

    /**
     * 直播id
     */
    @TableField("live_id")
    private Integer liveId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 上次观看时间
     */
    @TableField("last_watch_time")
    private LocalDateTime lastWatchTime;

    /**
     * 观看总时长
     */
    @TableField("count_time")
    private LocalDateTime countTime;


    @Override
    protected Serializable pkVal() {
        return this.historyId;
    }

}
