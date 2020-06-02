package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 栏目表
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
@TableName("column")
public class Column extends Model<Column> {

    private static final long serialVersionUID=1L;

    /**
     * 直播合集id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 直播合集的名字
     */
    @TableField("name")
    private String name;

    /**
     * 直播合集简介
     */
    @TableField("brief")
    private String brief;

    /**
     * 栏目url
     */
    @TableField("url")
    private String url;

    /**
     * 栏目展示图
     */
    @TableField("image")
    private String image;

    /**
     * 用于排序,热度值
     */
    @TableField("sort")
    private Integer sort;

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
