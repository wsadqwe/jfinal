package com.niit.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author
 * @Date 2022/10/13 8:28
 * @Description
 **/
@Aspect
@Component
@Order(2)
public class LogAspect2 {
    @Pointcut(value = "execution(* com.niit.service.UserService.*(..))")
    public void cut1(){}

    @Before(value="cut1()")
    public void before(){
        System.out.println("-----2---before----");
    }
    @After(value="cut1()")
    public void after(){
        System.out.println("-----2---after----");
    }
    @AfterReturning(value="cut1()",returning = "ob")
    public void afterReturning(Object ob){
        System.out.println("-----2---AfterReturning----");
    }
    @Around(value="cut1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("-----2---before--around--");
        //前置
        Object obj = pjp.proceed();////
        //后置
        //最终
        System.out.println("-----2---after--around--");
        return obj;
    }
}
