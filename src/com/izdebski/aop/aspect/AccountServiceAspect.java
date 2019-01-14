package com.izdebski.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class AccountServiceAspect {

    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Before method:"+joinPoint.getSignature().getName()+",Class"+joinPoint.getTarget()
        .getClass().getSimpleName());
    }
}