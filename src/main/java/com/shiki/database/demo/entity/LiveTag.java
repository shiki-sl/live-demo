package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * 直播标签中间表,用于搜索
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("live_tag")
public class LiveTag extends Model<LiveTag> {

    private static final long serialVersionUID=1L;

    @TableId("live_tag_id")
    private Integer liveTagId;

    /**
     * 标签id,对应表live_tag
     */
    @TableField("tag_id")
    private Integer tagId;

    /**
     * 直播id, 对应表live_broadcast
     */
    @TableField("live_id")
    private Integer liveId;

    /**
     * 栏目标签id,对应live_column表
     */
    @TableField("column_id")
    private Integer columnId;

    /**
     * 标签对应类型,1直播,2直播间
     */
    @TableField("live_tag_type")
    private Integer liveTagType;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.liveTagId;
    }

}
