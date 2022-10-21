package org.example.com.niit.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LogAspect {
    @Pointcut(value = "execution(* org.example.com.niit.service.UserService.*(..))")
    public void cut1(){}

    @Before(value="cut1()")
    public void before(){
        System.out.println();
    }
    @After(value = "cut1()")
    public void after(){
        System.out.println();
    }
    @AfterReturning(value = "cut1()",returning = "obj")
    public void afterReturing(Object obj){}

    @Around(value = "cut1()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{

        Object obj=pjp.proceed();

        return obj;
    }

}
