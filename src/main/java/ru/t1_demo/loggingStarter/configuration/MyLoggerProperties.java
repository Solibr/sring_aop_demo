package ru.t1_demo.loggingStarter.configuration;

import org.apache.logging.log4j.Level;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my-logger")
public class MyLoggerProperties {
    private Level level = Level.INFO;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
