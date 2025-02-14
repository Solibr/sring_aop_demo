package ru.t1_demo.loggingStarter.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import ru.t1_demo.loggingStarter.myLogger.MyLogger;

import java.util.Arrays;

@Aspect
public class MyLoggingAspect {

    private final MyLogger myLogger;

    public MyLoggingAspect(MyLogger myLogger) {
        this.myLogger = myLogger;
    }

    @Around("@annotation(ru.t1_demo.loggingStarter.annotation.MyLogger)")
    public Object log(ProceedingJoinPoint pJoinPoint) throws Throwable {
        myLogger.log("Request: " + Arrays.toString(pJoinPoint.getArgs()));
        Object result = pJoinPoint.proceed();
        myLogger.log("Response:" + result);
        return result;
    }

}
