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
 * 回放表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("replay")
public class Replay extends Model<Replay> {

    private static final long serialVersionUID=1L;

    @TableId(value = "replay_id", type = IdType.AUTO)
    private Integer replayId;

    /**
     * 回放视频所属的主播
     */
    @TableField("replay_cast_id")
    private Integer replayCastId;

    /**
     * 回放所属的直播id
     */
    @TableField("replay_live_id")
    private Integer replayLiveId;

    /**
     * 回看url
     */
    @TableField("replay_url")
    private String replayUrl;

    /**
     * 排序权重
     */
    @TableField("replay_sort")
    private Integer replaySort;

    /**
     * 直播结束的多少天内可以回放
     */
    @TableField("replay_time")
    private Integer replayTime;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.replayId;
    }

}
