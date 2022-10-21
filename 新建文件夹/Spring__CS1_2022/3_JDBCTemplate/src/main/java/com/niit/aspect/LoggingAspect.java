package com.niit.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;//////////////////////////////
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @Author
 * @Date 2022/10/14 15:00
 * @Description
 **/
@Aspect
@Component
//@Slf4j
public class LoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.niit.service.EmpService.*(..))")
    public void before(JoinPoint jp){
        log.error(jp.toString(),"------logging-----Before------");
        log.warn(jp.getSignature().toString(),"------logging-----Before------");
        log.trace(jp.getThis().toString(),"------logging-----Before------");
        log.info(jp.getTarget().toString(),"------logging-----Before------");
    }

    @After("execution(* com.niit.service.EmpService.*(..))")
    public void after(JoinPoint jp){
        log.error(jp.toString(),"------logging-----After------");
        log.warn(jp.getSignature().toString(),"------logging-----After------");
        log.trace(jp.getThis().toString(),"------logging-----After------");
        log.info(jp.getTarget().toString(),"------logging-----After------");
    }
}
