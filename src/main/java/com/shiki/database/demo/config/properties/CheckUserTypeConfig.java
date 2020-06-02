package com.shiki.database.demo.config.properties;

import com.shiki.database.demo.common.core.constant.enums.CheckLoginTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author shiki
 * 获取user信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "user")
public class CheckUserTypeConfig {

    /**
     * 用户信息存储位置,默认session
     */
    private CheckLoginTypeEnum storageType = CheckLoginTypeEnum.SESSION;

    /**
     * 取得用户信息的key
     * 根据userId取数据则key应为userId
     * 从session中取数据则key为session.getAttribute(key)中的key
     * 默认为user
     */
    private String key = "user";
}