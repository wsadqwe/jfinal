package com.niit.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class loggingAspect {
    /*
    *   前置通知
    * */
    public void beforeMethod(){
        System.out.println("----Before-----");
    }

    /*
     *   后置通知
     * */
    public void afterReturningMethod(Object returnVal){
        System.out.println("----AfterReturning"+returnVal.toString());
    }

    /*
     *   最终通知
     * */
    public void afterMethod(){
        System.out.println("----After-----");
    }

    /*
     *   环绕通知
     * */
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("----Before Around-----");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("----After Around-----");
        return obj;

    }

    /*
     *   异常通知
     * */
    public void afterThrowingMethod(IllegalArgumentException exception){
        System.out.println("----AfterThrowing"+exception.toString());
    }

}
