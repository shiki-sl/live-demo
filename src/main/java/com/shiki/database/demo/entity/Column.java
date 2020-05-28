package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 栏目表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("column")
public class Column extends Model<Column> {

    private static final long serialVersionUID=1L;

    /**
     * 直播合集id
     */
    @TableId(value = "column_id", type = IdType.AUTO)
    private Integer columnId;

    /**
     * 直播合集的名字
     */
    @TableField("column_name")
    private Integer columnName;

    /**
     * 直播合集简介id
     */
    @TableField("column_title")
    private String columnTitle;

    /**
     * 栏目url
     */
    @TableField("column_url")
    private String columnUrl;

    /**
     * 栏目展示图
     */
    @TableField("column_img")
    private String columnImg;

    /**
     * 用于排序,热度值
     */
    @TableField("column_sort")
    private Integer columnSort;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.columnId;
    }

}
