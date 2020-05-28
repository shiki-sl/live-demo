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
 * 直播礼物表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("present")
public class Present extends Model<Present> {

    private static final long serialVersionUID=1L;

    /**
     * 礼物id
     */
    @TableId(value = "present_id", type = IdType.AUTO)
    private Integer presentId;

    /**
     * 礼物名称
     */
    @TableField("present_name")
    private Integer presentName;

    /**
     * 可送礼物的会员等级
     */
    @TableField("present_vip_level")
    private Integer presentVipLevel;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.presentId;
    }

}
