package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 直播表
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
@TableName("live")
public class Live extends Model<Live> {

    private static final long serialVersionUID=1L;

    /**
     * 直播id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 主播id
     */
    @TableField("cast_id")
    private Long castId;

    /**
     * 直播间展示图
     */
    @TableField("image")
    private String image;

    /**
     * 直播间url
     */
    @TableField("url")
    private String url;

    /**
     * 观看直播的vip等级
     */
    @TableField("vip_level")
    private Integer vipLevel;

    /**
     * 直播首页排序
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 直播的简介
     */
    @TableField("brief")
    private String brief;

    /**
     * 直播开始时间戳
     */
    @TableField("start_time")
    private LocalDateTime startTime;

    /**
     * 直播结束时间戳
     */
    @TableField("end_time")
    private LocalDateTime endTime;

    /**
     * 为0不展示为1展示
     */
    @TableField("is_show")
    private Integer isShow;

    /**
     * 为0正常,为1删除
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
