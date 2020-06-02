package com.shiki.database.demo.config.properties;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author shiki
 * redis-session的配置提示信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "redis.session")
public class RedisSessionYmlConfig {

    /**
     * redis-session在redis中的命名空间
     */
    private String redisNamespace = "";

    /**
     * redis中每隔多久清除一次过期session
     */
    private String cleanupCron = "";

    /**
     * session过期时长
     */
    private Integer maxInactiveIntervalInSeconds = 600;

}