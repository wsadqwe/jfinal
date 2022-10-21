package com.niit.test;

import com.niit.bean.Person;
import org.junit.Test;

import java.lang.annotation.ElementType;

/**
 * @Author
 * @Date 2022/9/26 19:54
 * @Description
 **/
public class UnitTest {

    @Test
    public void test01() throws ClassNotFoundException {

        //1.方式一p通过getClass()
        Person person = new Person();
        Class clazz1 = person.getClass();
        System.out.println(clazz1);

        //2.方式二：Class.forName(String classpath)
        Class clazz2 = Class.forName("com.niit.bean.Person");
        System.out.println(clazz2);
        System.out.println(clazz1==clazz2);

        //3.方式三：Entity.class
        Class clazz3 = Person.class;
        System.out.println(clazz3);
        System.out.println(clazz3==clazz1);

        //4.方式四：类加载器：classLoader
        ClassLoader classLoader = UnitTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("com.niit.bean.Person");
        System.out.println(clazz4);
        System.out.println(clazz1==clazz4);
    }

    @Test
    public void propertyTest(){
        Class c1 = Object.class;
        Class c2 = void.class;
        Class c3 = int.class;
        Class c4 = int[].class;
        Class c5 = String[][].class;
        Class c6 = Override.class;//@interface
        Class c7 = ElementType.class;//用在注解上 @interface
        Class c8 = Enum.class;
        Class c9 = Comparable.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass()==b.getClass());
    }
}
