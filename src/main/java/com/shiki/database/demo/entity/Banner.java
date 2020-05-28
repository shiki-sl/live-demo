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
 * 首页轮播图
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("banner")
public class Banner extends Model<Banner> {

    private static final long serialVersionUID=1L;

    @TableId(value = "banner_id", type = IdType.AUTO)
    private Integer bannerId;

    /**
     * banner图片

     */
    @TableField("banner_img")
    private String bannerImg;

    /**
     * 点击图片链接
     */
    @TableField("banner_url")
    private String bannerUrl;

    /**
     * banner排序规则
     */
    @TableField("banner_sort")
    private Integer bannerSort;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.bannerId;
    }

}
