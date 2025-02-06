    @Bean("sampleSchedulerThreadExecutor")
    public Executor sampleSchedulerThreadExecutor() {
        var executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(Integer.parseInt(openForBiddingCorePoolSize));
        executor.setMaxPoolSize(Integer.parseInt(openForBiddingMaxPoolSize));
        executor.setThreadNamePrefix("Sample_Scheduler_Consumer");
        executor.initialize();
        return executor;
    }