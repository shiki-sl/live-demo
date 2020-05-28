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
 * 直播评论表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("log_comment")
public class LogComment extends Model<LogComment> {

    private static final long serialVersionUID=1L;

    /**
     * 评论id
     */
    @TableId(value = "comment_id", type = IdType.AUTO)
    private Integer commentId;

    /**
     * 评论所属用户id
     */
    @TableField("comment_user_id")
    private Integer commentUserId;

    /**
     * 评论文本
     */
    @TableField("comment_text")
    private String commentText;

    /**
     * 评论所属直播id
     */
    @TableField("comment_broadcast_id")
    private Integer commentBroadcastId;

    @TableField("video_time")
    private Integer videoTime;

    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 0:正常,1:显示
     */
    @TableField("is_del")
    @TableLogic
    private Boolean del;

    /**
     * 用户该条评论是否正常显示
     */
    @TableField("comment_is_normal")
    private Integer commentIsNormal;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.commentId;
    }

}
