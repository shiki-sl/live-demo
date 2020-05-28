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
 * 直播表
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("live")
public class Live extends Model<Live> {

    private static final long serialVersionUID=1L;

    /**
     * 直播id
     */
    @TableId(value = "live_id", type = IdType.AUTO)
    private Integer liveId;

    /**
     * 主播id
     */
    @TableField("live_cast_id")
    private Integer liveCastId;

    /**
     * 直播间展示图
     */
    @TableField("live_img")
    private String liveImg;

    /**
     * 直播间url
     */
    @TableField("live_url")
    private String liveUrl;

    /**
     * 观看直播的vip等级
     */
    @TableField("live_vip_level")
    private Integer liveVipLevel;

    /**
     * 直播首页排序
     */
    @TableField("live_sort")
    private Integer liveSort;

    /**
     * 直播的简介
     */
    @TableField("live_introduction")
    private String liveIntroduction;

    /**
     * 直播开始时间戳
     */
    @TableField("live_start_time")
    private Integer liveStartTime;

    /**
     * 直播结束时间戳
     */
    @TableField("live_end_time")
    private Integer liveEndTime;

    /**
     * 为0展示
其他情况不展示,并提供code和msg
     */
    @TableField("live_show")
    private Integer liveShow;

    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 为0正常,为1删除
     */
    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.liveId;
    }

}
