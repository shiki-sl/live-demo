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
 * 用户权限中间表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("live_permissions")
public class LivePermissions extends Model<LivePermissions> {

    private static final long serialVersionUID=1L;

    @TableId(value = "user_permissions_id", type = IdType.AUTO)
    private Integer userPermissionsId;

    /**
     * 直播id
     */
    @TableField("live_id")
    private Integer liveId;

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
        return this.userPermissionsId;
    }

}
