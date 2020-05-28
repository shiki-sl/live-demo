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
 * 热搜表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("search")
public class Search extends Model<Search> {

    private static final long serialVersionUID=1L;

    @TableId(value = "hot_search_id", type = IdType.AUTO)
    private Integer hotSearchId;

    /**
     * 热搜词
     */
    @TableField("hot_search_name")
    private String hotSearchName;

    @TableField("hot_url")
    private String hotUrl;

    /**
     * 热搜点击排名,降序
     */
    @TableField("hot_click")
    private Integer hotClick;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.hotSearchId;
    }

}
