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
 * 权限表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("permissions")
public class Permissions extends Model<Permissions> {

    private static final long serialVersionUID=1L;

    /**
     * 权限id
     */
    @TableId(value = "permissions_id", type = IdType.AUTO)
    private Integer permissionsId;

    /**
     * 用户名
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 权限名
     */
    @TableField("permissions_name")
    private String permissionsName;

    /**
     * 权限资源
     */
    @TableField("permissions_resources")
    private String permissionsResources;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.permissionsId;
    }

}
