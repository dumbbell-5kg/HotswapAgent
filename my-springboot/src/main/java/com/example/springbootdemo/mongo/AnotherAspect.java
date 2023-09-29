package com.example.springbootdemo.mongo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnotherAspect {


    /**
     * find findOne aggregate
     */

    @Pointcut("execution(public * com.example.springbootdemo.mongo.AnotherService.service(..)) "
    )
    public void pointCut_search() {
    }

    @Around("pointCut_search()")
    public Object around_search(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return proceedingJoinPoint.proceed();
    }


}