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
 * 主播礼物中间表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("log_present")
public class LogPresent extends Model<LogPresent> {

    private static final long serialVersionUID=1L;

    /**
     * 自增主键
     */
    @TableId(value = "broadcast_present_id", type = IdType.AUTO)
    private Integer broadcastPresentId;

    /**
     * 礼物所属用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 发送礼物id
     */
    @TableField("present_id")
    private Integer presentId;

    /**
     * 本次发送礼物总数
     */
    @TableField("present_count")
    private Integer presentCount;

    /**
     * 礼物所属直播id
     */
    @TableField("broadcast_id")
    private Integer broadcastId;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.broadcastPresentId;
    }

}
