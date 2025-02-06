package com.abdul.sample.config;

import java.util.concurrent.Executor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class BeanConfig {

    @Bean("sampleSchedulerThreadExecutor")
    public Executor sampleSchedulerThreadExecutor() {
        var executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(24);
        executor.setMaxPoolSize(24);
        executor.setThreadNamePrefix("Sample_Scheduler_Consumer");
        executor.initialize();
        return executor;
    }
}

