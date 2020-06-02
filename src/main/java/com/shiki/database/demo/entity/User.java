package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
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
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID=1L;

    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 恒天财富返回的用户标识
     */
    @TableField("mark")
    private Integer mark;

    /**
     * 用户微信登陆时微信返回的用户唯一id
     */
    @TableField("wechat_union_id")
    private String wechatUnionId;

    /**
     * 用户头像
     */
    @TableField("image")
    private String image;

    /**
     * 用户名
     */
    @TableField("name")
    private String name;

    /**
     * vip等级
     */
    @TableField("vip_level")
    private Integer vipLevel;

    /**
     * 0正常,1异常
     */
    @TableField("status")
    private Integer status;

    /**
     * 0:正常,1删除
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
     * 删除时间
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
