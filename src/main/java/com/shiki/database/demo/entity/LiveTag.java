package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 直播标签中间表,用于搜索
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
@TableName("live_tag")
public class LiveTag extends Model<LiveTag> {

    private static final long serialVersionUID=1L;

    @TableId("id")
    private Long id;

    /**
     * 标签id,对应表tag
     */
    @TableField("tag_id")
    private Long tagId;

    /**
     * 直播id, 对应表live
     */
    @TableField("live_id")
    private Long liveId;

    /**
     * 栏目标签id,对应live_column表
     */
    @TableField("column_id")
    private Long columnId;

    /**
     * 标签对应类型,1直播,2直播间
     */
    @TableField("tag_type")
    private Integer tagType;

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
    @TableField("update_at")
    private LocalDateTime updateAt;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
