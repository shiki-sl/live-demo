package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 主播礼物中间表
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
@TableName("log_present")
public class LogPresent extends Model<LogPresent> {

    private static final long serialVersionUID=1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 礼物所属用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 发送礼物id
     */
    @TableField("present_id")
    private Long presentId;

    /**
     * 本次发送礼物总数
     */
    @TableField("present_count")
    private Long presentCount;

    /**
     * 礼物所属直播id
     */
    @TableField("live_id")
    private Long liveId;

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
