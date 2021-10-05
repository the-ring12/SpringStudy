package com.the_ring.spring.aop.jdk;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 增强类
@Component
@Aspect
// @Order 用于多个类同时增强同一类，设置优先级，值越低优先级越高
@Order(3)
public class UserProxy {

    // 前置通知
    // @Before 注解表示前置通知
    @Before(value = "execution(* com.the_ring.spring.aop.jdk.User.add())")
    public void before() {
        System.out.println("before.....");
    }

    @AfterReturning(value = "execution(* com.the_ring.spring.aop.jdk.User.add())")
    public void afterReturning() {
        System.out.println("afterReturning.....");
    }
    @After(value = "execution(* com.the_ring.spring.aop.jdk.User.add())")
    public void after() {
        System.out.println("after.....");
    }

    // 异常通知
    @AfterThrowing(value = "execution(* com.the_ring.spring.aop.jdk.User.add())")
    public void afterThrowing() {
        System.out.println("afterThrowing.....");
    }

    // 环绕通知
    @Around(value = "execution(* com.the_ring.spring.aop.jdk.User.add())")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.....");

        // 被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.....");
    }
}
