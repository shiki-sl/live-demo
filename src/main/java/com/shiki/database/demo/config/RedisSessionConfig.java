package com.shiki.database.demo.config;

import com.shiki.database.demo.common.core.constant.ConfigConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.RedisHttpSessionConfiguration;

import static com.shiki.database.demo.common.core.constant.ConfigConstants.DEFAULT_CLEANUP_CRON;
import static com.shiki.database.demo.common.core.constant.ConfigConstants.DEFAULT_NAMESPACE;

/**
 * @author shiki
 */
@Slf4j
@Configuration
public class RedisSessionConfig extends RedisHttpSessionConfiguration {
    /**
     *
     * @param redisNamespace 配置session缓存头
     * @param cleanupCron 注解定时清除过期session,默认值{@link ConfigConstants#DEFAULT_CLEANUP_CRON}
     * @param maxInactiveIntervalInSeconds 配置缓存时长
     */
    public RedisSessionConfig(@Value("${redis.session.redisNamespace}") String redisNamespace,
                              @Value("${redis.session.cleanupCron}") String cleanupCron,
                              @Value("${redis.session.maxInactiveIntervalInSeconds}") Integer maxInactiveIntervalInSeconds) {
//        Property
        super.setRedisNamespace(StringUtils.isEmpty(redisNamespace) ? DEFAULT_NAMESPACE : redisNamespace);
        super.setCleanupCron(StringUtils.isEmpty(cleanupCron) ? DEFAULT_CLEANUP_CRON : cleanupCron);
        super.setMaxInactiveIntervalInSeconds(
                maxInactiveIntervalInSeconds == null || maxInactiveIntervalInSeconds <= 0 ? 600 : maxInactiveIntervalInSeconds);
        log.info("redisNamespace:" + redisNamespace);
        log.info("cleanupCron:" + cleanupCron);
        log.info("maxInactiveIntervalInSeconds:" + maxInactiveIntervalInSeconds);
    }

}