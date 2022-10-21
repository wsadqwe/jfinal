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
@Order(3)
public class LogAspect3 {

    @Pointcut(value = "execution(* com.niit.service.UserService.*(..))")
    public void cut1(){}

    @Before(value="cut1()")
    public void before(){
        System.out.println("-----3---before----");
    }
    @After(value="cut1()")
    public void after(){
        System.out.println("-----3---after----");
    }
    @AfterReturning(value="cut1()",returning = "ob")
    public void afterReturning(Object ob){
        System.out.println("-----3---AfterReturning----");
    }
    @Around(value="cut1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("-----3---before--around--");
        Object obj = pjp.proceed();
        System.out.println("-----3---after--around--");
        return obj;
    }
}
