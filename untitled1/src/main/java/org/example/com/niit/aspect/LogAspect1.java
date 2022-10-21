package org.example.com.niit.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.graalvm.compiler.lir.Opcode;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LogAspect1 {
    @Pointcut(value = "execution(* org.example.com.niit.service.UserService.*(..))")
    public void cut2(){}

    @Before(value="cut2()")
    public void before(){
        System.out.println();
    }
    @After(value = "cut2()")
    public void after(){
        System.out.println();
    }
    @AfterReturning(value="cut2()",returning="obj")
    public void afterReturing(Object obj){}

    @Around(value="cut2()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{

        Object obj=pjp.proceed();

        return obj;
    }

}
