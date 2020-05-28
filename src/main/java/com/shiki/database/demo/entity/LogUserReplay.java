package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * <p>
 * 回放记录表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("log_user_replay")
public class LogUserReplay extends Model<LogUserReplay> {

    private static final long serialVersionUID=1L;

    /**
     * 回放日志id
     */
    @TableField("log_id")
    private Integer logId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 回放id
     */
    @TableField("replay_id")
    private Integer replayId;

    /**
     * 回放开始时间
     */
    @TableField("start_time")
    private Integer startTime;

    /**
     * 回放结束时间
     */
    @TableField("end_time")
    private Integer endTime;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 是否删除
     */
    @TableField("is_del")
    @TableLogic
    private Integer isDel;

    /**
     * 删除时间
     */
    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
