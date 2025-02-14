package ru.t1_demo.loggingStarter.configuration;

import org.apache.logging.log4j.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.t1_demo.loggingStarter.aop.MyLoggingAspect;
import ru.t1_demo.loggingStarter.myLogger.MyLogger;

@Configuration
@EnableConfigurationProperties(MyLoggerProperties.class)
public class MyLoggerAutoConfiguration {

    @Autowired
    private MyLoggerProperties properties;

    @Bean
    @ConditionalOnProperty(name = "my-logger.status", havingValue = "enabled", matchIfMissing = true)
    public MyLoggingAspect myLoggingAspect() {
        Level level = properties.getLevel();
        return new MyLoggingAspect(new MyLogger(level));
    }

}
