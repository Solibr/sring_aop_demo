package ru.t1_demo.loggingStarter.configuration;

import org.springframework.beans.factory.annotation.Autowired;
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
    public MyLogger myLogger() {
        String text = properties.getLevel();
        return new MyLogger(text);
    }

    @Bean
    public MyLoggingAspect myLoggingAspect() {
        return new MyLoggingAspect();
    }

}
