package ru.t1_demo.loggingStarter.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my-logger")
public class MyLoggerProperties {
    private String level = "DEFAULT";

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
