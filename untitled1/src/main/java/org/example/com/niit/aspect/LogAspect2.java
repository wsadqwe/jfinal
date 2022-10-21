package org.example.com.niit.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class LogAspect2 {
    @Pointcut(value = "execution(* org.example.com.niit.service.UserService.*(..))")
    public void cut3(){}

    @Before(value="cut3()")
    public void before(){
        System.out.println();
    }
    @After(value = "cut3()")
    public void after(){
        System.out.println();
    }
    @AfterReturning(value="cut3()",returning="obj")
    public void afterReturing(Object obj){}
    @Around(value="cut3()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{

        Object obj=pjp.proceed();

        return obj;
    }

}
