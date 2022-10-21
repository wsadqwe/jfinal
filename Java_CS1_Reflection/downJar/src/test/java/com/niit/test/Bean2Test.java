package com.niit.test;

import com.niit.bean1.Room;
import com.niit.bean2.Zoo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/9/30 20:30
 * @Description
 **/
public class Bean2Test {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Zoo zoo = (Zoo) context.getBean("zoo");

        System.out.println(zoo.toString());
    }
}
