package com.niit.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Aspect
@Component
@Order(2)
public class UserAspect1 {


        @Pointcut(value = "execution(* com.niit.service.UserService.*(..))")
        public void cut(){}

        @Before(value="cut()")
        public void before(){
            System.out.println("before2");
        }
        @After(value = "cut()")
        public void after(){
            System.out.println("After2");
        }
        @AfterReturning(value="cut()",returning="obj")
        public void afterReturing(Object obj){System.out.println("AfterReturning2");}

        @Around(value="cut()")
        public Object around(ProceedingJoinPoint pjp)throws Throwable{
            System.out.println("Around4");
            Object obj=pjp.proceed();
            System.out.println("Around5");
            return obj;
        }
}
