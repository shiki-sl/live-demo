package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 热搜表
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
@TableName("hot_search")
public class HotSearch extends Model<HotSearch> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 热搜词
     */
    @TableField("name")
    private String name;

    /**
     * 热搜链接
     */
    @TableField("url")
    private String url;

    /**
     * 热搜点击排名,降序
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
