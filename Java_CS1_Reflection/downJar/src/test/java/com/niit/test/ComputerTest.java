package com.niit.test;

import com.niit.bean.Computer;
import com.niit.bean.Plane;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/9/30 19:40
 * @Description
 **/
public class ComputerTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean(Computer.class);

        System.out.println(computer.toString());
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = (Computer) context.getBean("computer2");

        System.out.println(computer.toString());
    }

    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = (Computer) context.getBean("computer3");

        System.out.println(computer.toString());
    }

    @Test
    public void test04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = (Computer) context.getBean("computer4");

        System.out.println(computer.toString());
    }

    @Test
    public void test05(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = (Computer) context.getBean("computer5");

        System.out.println(computer.toString());
    }
}
