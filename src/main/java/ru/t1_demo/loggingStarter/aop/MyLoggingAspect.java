package ru.t1_demo.loggingStarter.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class MyLoggingAspect {

    @Around("@annotation(ru.t1_demo.loggingStarter.annotation.MyLogger)")
    public Object log(ProceedingJoinPoint pJoinPoint) throws Throwable {

        System.out.println("Request: " + Arrays.toString(pJoinPoint.getArgs()));
        Object result = pJoinPoint.proceed();
        System.out.println("Response:" + result);

        return result;
    }

}
