package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 首页轮播图
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
@TableName("banner")
public class Banner extends Model<Banner> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * banner图片
     */
    @TableField("image")
    private String image;

    /**
     * 点击图片链接
     */
    @TableField("url")
    private String url;

    /**
     * banner排序规则
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
