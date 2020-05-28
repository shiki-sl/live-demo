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
 * 用户与直播关联表

 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("user_collect")
public class UserCollect extends Model<UserCollect> {

    private static final long serialVersionUID=1L;

    /**
     * 自增主键id
     */
    @TableId(value = "user_broadcast_id", type = IdType.AUTO)
    private Integer userBroadcastId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 用户关注的直播id
     */
    @TableField("live_id")
    private Integer liveId;

    /**
     * 用户关注的栏目id
     */
    @TableField("live_column_id")
    private Integer liveColumnId;

    /**
     * 根据状态来确定用户与直播的逻辑关系
0:用户关注的直播id.对应表htzb_live
1:用户关注的栏目id,对应表htzb_cloumn


     */
    @TableField("user_collect_type")
    private Integer userCollectType;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.userBroadcastId;
    }

}
