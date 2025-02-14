package ru.t1_demo.loggingStarter.myLogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

public class MyLogger {

    private final Level level;

    private final Logger apacheLogger;

    public MyLogger(Level level) {
        this.level = level;
        this.apacheLogger = LogManager.getLogger();
    }

    public void log(String logMessage) {
        apacheLogger.log(level, logMessage);
    }
}
