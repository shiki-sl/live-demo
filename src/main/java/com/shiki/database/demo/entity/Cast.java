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
import lombok.experimental.Accessors;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 直播的权限(嘉宾or主播)
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("cast")
public class Cast extends Model<Cast> {

    private static final long serialVersionUID=1L;

    @TableId(value = "cast_id", type = IdType.AUTO)
    private Integer castId;

    /**
     * 主播or嘉宾名字

     */
    @TableField("cast_name")
    private String castName;

    @TableField("cast_introduction")
    private String castIntroduction;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("is_del")
    @TableLogic
    private Boolean del;

    @TableField("delete_time")
    private LocalDateTime deleteTime;


    @Override
    protected Serializable pkVal() {
        return this.castId;
    }

}
