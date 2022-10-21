package com.niit.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author
 * @Date 2022/10/7 19:39
 * @Description
 **/
public class LoggingAspect {

    /*
        前置通知
     */
    public void beforeMethod(JoinPoint jp){
        System.out.println(".....Before");
        System.out.println(    "方法"+jp.getSignature());
        System.out.println("  方法名"+jp.getArgs());
        System.out.println("  方法名"+jp.getThis());
        System.out.println("  方法名"+jp.getKind());
        System.out.println("  方法名"+jp.toString());
        System.out.println("  方法名"+jp.getClass());
        System.out.println("  方法名"+jp.getTarget());

    }

    /*
       后置通知
    */
    public void afterReturningMethod(Object returnVal){
        System.out.println(".....AfterReturning"+returnVal.toString());
    }
    /*
       最终通知
    */
    public void afterMethod(){
        System.out.println(".....After");
    }
    /*
       环绕通知
    */
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(".....Before Around");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println(".....After Around");
        return obj;
    }
    /*
       前置通知
    */
    public void afterThrowingMethod(IllegalArgumentException exception){
        System.out.println(".....AfterThrowing"+exception.toString());
    }
}
