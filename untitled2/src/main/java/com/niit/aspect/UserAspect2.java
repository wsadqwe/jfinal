package com.niit.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class UserAspect2 {


        @Pointcut(value = "execution(* com.niit.service.UserService.*(..))")
        public void cut2(){}

        @Before(value="cut2()")
        public void before(){
            System.out.println("Before");
        }
        @After(value = "cut2()")
        public void after(){
            System.out.println("After");
        }
        @AfterReturning(value="cut2()",returning="obj")
        public void afterReturing(Object obj){System.out.println("AfterReturning");}

        @Around(value="cut2()")
        public Object around(ProceedingJoinPoint pjp)throws Throwable{
            System.out.println("Around");
            Object obj=pjp.proceed();
            System.out.println("Around2");
            return obj;
        }
}
