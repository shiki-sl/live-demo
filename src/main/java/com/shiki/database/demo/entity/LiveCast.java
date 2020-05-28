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
 * 嘉宾直播关联表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("live_cast")
public class LiveCast extends Model<LiveCast> {

    private static final long serialVersionUID=1L;

    @TableId(value = "live_cast_id", type = IdType.AUTO)
    private Boolean liveCastId;

    /**
     * 嘉宾id
     */
    @TableField("cast_id")
    private Integer castId;

    /**
     * 所属直播id
     */
    @TableField("live_id")
    private Integer liveId;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.liveCastId;
    }

}
