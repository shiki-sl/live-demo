package com.shiki.database.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

/**
 * @author shiki
 * @date 2020-06-01 下午6:00
 */
@Component
public class ThreadPoolConfig {

    @Bean(name = "logExecutor")
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        int nCpu = Runtime.getRuntime().availableProcessors();
        if (nCpu >= 4) {
            nCpu /= 2;
        } else if (nCpu == 1) {
            nCpu = 1;
        } else {
            nCpu--;
        }
        executor.setCorePoolSize(nCpu);
        executor.setMaxPoolSize(2 * nCpu);
        executor.setQueueCapacity(32);
        executor.setKeepAliveSeconds(60 * 10);
        return executor;
    }
}
