package ru.t1_demo.loggingStarter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.t1_demo.loggingStarter.myLogger.MyLogger;

@Configuration
public class MyLoggerAutoConfiguration {

    @Bean
    public MyLogger myLogger() {
        String text = "default text";
        return new MyLogger(text);
    }

}
