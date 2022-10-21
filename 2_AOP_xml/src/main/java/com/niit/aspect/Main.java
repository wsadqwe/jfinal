package com.niit.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        lion lion = context.getBean(com.niit.aspect.lion.class);
        lion.throwException1();
        System.out.println("-----------");
        lion.getName();
    }
}
