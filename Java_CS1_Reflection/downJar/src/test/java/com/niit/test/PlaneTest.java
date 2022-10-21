package com.niit.test;

import com.niit.bean.Plane;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author
 * @Date 2022/9/30 15:20
 * @Description
 **/
public class PlaneTest {
    @Test
    public void test01() {

//        BeanFactory context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //1.实例IOC容器
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\CodeProjects\\JavaIDEAProjects\\Java_CS1_Reflection\\downJar\\src\\main\\resources\\applicationContext.xml");
        //2.获取对象
//        Plane plane = new Plane();
        Plane plane = (Plane) context.getBean("plane1");//按名称注入

        //3.调用对象
        System.out.println(plane.toString());
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Plane p1 = (Plane) context.getBean("plane1");
        Plane p2 = (Plane) context.getBean("plane2");

//        //按类型注入，单个bean时使用
//        Plane p1 = context.getBean(Plane.class);
//        Plane p2 = context.getBean(Plane.class);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1==p2);
    }


}
