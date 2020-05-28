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
 * 直播标签表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("tag")
public class Tag extends Model<Tag> {

    private static final long serialVersionUID=1L;

    @TableId(value = "tag_id", type = IdType.AUTO)
    private Integer tagId;

    /**
     * 直播标签
     */
    @TableField("tag_name")
    private String tagName;

    /**
     * 首页是否展示该标签
     */
    @TableField("tag_is_home")
    private Integer tagIsHome;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.tagId;
    }

}
