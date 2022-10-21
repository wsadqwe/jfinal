package com.niit.test;

import com.niit.bean.Computer;
import com.niit.bean1.Room;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/9/30 20:15
 * @Description
 **/
public class Bean1Test {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Room room = (Room) context.getBean("room1");

        System.out.println(room.toString());
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Room room = (Room) context.getBean("room2");

        System.out.println(room.toString());
    }
}
