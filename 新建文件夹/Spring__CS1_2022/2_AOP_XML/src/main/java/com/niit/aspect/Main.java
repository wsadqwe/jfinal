package com.niit.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/10/7 20:15
 * @Description
 **/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Lion lion = context.getBean(Lion.class);
//        lion.throwException1();
//        System.out.println("-------------------------");
        lion.getName();
    }
}
