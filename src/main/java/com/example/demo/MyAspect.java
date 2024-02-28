package com.example.demo;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.example.demo.service.*.*(..))")
    public void beforeServiceMethods() {
        System.out.println("Executing before service methods...");
    }
    
    @Before("beforeServiceMethods()")
    public void aeforeServiceMethods() {
        System.out.println("Executing before service methods...");
    }
    
}
