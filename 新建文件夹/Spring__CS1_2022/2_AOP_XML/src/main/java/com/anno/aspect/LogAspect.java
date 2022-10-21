package com.anno.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author
 * @Date 2022/10/10 20:22
 * @Description
 **/

@Aspect
@Component
public class LogAspect {
    @Pointcut(value = "execution(* com.anno.service.UserService.*(..))")
    public void pointCut1(){}

    @Pointcut(value = "execution(* com.anno.service.*.*(..))")
    public void pointCut2(){}

    @Before("execution(* com.anno.service.UserService.*(..))")
    public void before(){
        System.out.println("  before");
    }
    @After(value = "pointCut2()")
    public void after(JoinPoint joinPoint){
        System.out.println("   after :"+joinPoint.getSourceLocation());
    }
    @Around(value = "pointCut1()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("   before around"+proceedingJoinPoint.getThis()+
                " "+(new Date()));
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("   before around"+proceedingJoinPoint.getTarget()+
                " "+(new Date()));
        return obj;
    }
    @AfterThrowing(value = "pointCut1()",throwing = "exception")
    public void afterThrowing(IllegalArgumentException exception){
        System.out.println("  afterThrowing "+exception.toString());
    }
    @AfterReturning(value = "pointCut1()",returning = "object")
    public void afterReturning(Object object){
        System.out.println("   afterReturning "+(new Date()));
    }
}
