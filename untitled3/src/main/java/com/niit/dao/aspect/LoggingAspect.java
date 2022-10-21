package com.niit.dao.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LoggingAspect {
    private static final Logger log = (Logger) LoggerFactory.getLogger(LoggingAspect.class);
    @Before("execution (* com.niit.service.*(..))")
    public void before(JoinPoint jp){
        log.error(jp.toString()," ");
        log.warn(jp.getSignature().toString());
        log.trace(jp.getThis().toString());
        log.info(jp.getTarget().toString());
}
    @After("execution (* com.niit.service.*(..))")
    public void after(JoinPoint jp){
        log.error(jp.toString()," ");
        log.warn(jp.getSignature().toString());
        log.trace(jp.getThis().toString());
        log.info(jp.getTarget().toString());
}
}
