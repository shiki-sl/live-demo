package com.shiki.database.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 直播礼物表
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
@TableName("present")
public class Present extends Model<Present> {

    private static final long serialVersionUID=1L;

    /**
     * 礼物id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 礼物名称
     */
    @TableField("name")
    private String name;

    /**
     * 可送礼物的会员等级
     */
    @TableField("vip_level")
    private Integer vipLevel;

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
