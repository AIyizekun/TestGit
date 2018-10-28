package com.yzk.mocktest.mocktest.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.yzk.mocktest.mocktest.service.*.*(..))")
    public void executeService(){

    }

    @AfterReturning(value = "executeService()")
    public void afterReturning(){
        System.out.println("后入式");
    }

    @Before("executeService()")
    public void before(){
        System.out.println("前置通知");
    }
}
