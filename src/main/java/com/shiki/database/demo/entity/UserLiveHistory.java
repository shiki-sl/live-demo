package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户观看直播统计表
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
@TableName("user_live_history")
public class UserLiveHistory extends Model<UserLiveHistory> {

    private static final long serialVersionUID=1L;

    /**
     * 用户观看直播历史id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 直播id
     */
    @TableField("live_id")
    private Long liveId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 上次观看时间
     */
    @TableField("last_watch_time")
    private LocalDateTime lastWatchTime;

    /**
     * 观看总时长
     */
    @TableField("count_time")
    private Integer countTime;

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
