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
 * 用户表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID=1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 恒天财富返回的用户标识
     */
    @TableField("user_mark")
    private Integer userMark;

    /**
     * 用户微信登陆时微信返回的用户唯一id
     */
    @TableField("user_wechat_unionID")
    private String userWechatUnionid;

    @TableField("photo_src")
    private String photoSrc;

    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;

    @TableField("user_vip_level")
    private Integer userVipLevel;

    /**
     * 0正常,1异常
     */
    @TableField("user_type")
    private Integer userType;

    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 0:正常,1用户删除
     */
    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
