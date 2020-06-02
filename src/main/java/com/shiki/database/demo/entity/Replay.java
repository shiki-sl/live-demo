package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 回放表
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
@TableName("replay")
public class Replay extends Model<Replay> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 回放视频所属的主播
     */
    @TableField("cast_id")
    private Long castId;

    /**
     * 回放所属的直播id
     */
    @TableField("live_id")
    private Long liveId;

    /**
     * 回看url
     */
    @TableField("url")
    private String url;

    /**
     * 降序排序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 直播结束的多少天内可以回放
     */
    @TableField("replay_time")
    private LocalDateTime replayTime;

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
