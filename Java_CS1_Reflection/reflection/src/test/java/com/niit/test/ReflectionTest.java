package com.niit.test;

import com.niit.bean.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author
 * @Date 2022/9/29 9:07
 * @Description
 **/
public class ReflectionTest {
    /*
        A>获取构造器
            单：
                getConstructor()
                getDeclaredConstructor()
            多个：
                getConstructors()
                getDeclaredConstructors()  所有
     */
    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.加载类对象
        Class<?> clazz = Class.forName("com.niit.bean.Student");

        System.out.println("------------------获取所有公共构造方法-----------------");
        Constructor[] cons = clazz.getConstructors();
        for (Constructor c : cons){
            System.out.println(c);
        }

        System.out.println("------------------获取所有构造方法-----------------");
        Constructor[] cons1 = clazz.getDeclaredConstructors();
        for (Constructor c : cons1){
            System.out.println(c);
        }

        System.out.println("------------------获取无参构造方法-----------------");
        Constructor con = clazz.getConstructor(null);//null
        System.out.println(con);
        Student student = (Student) con.newInstance();
        student.show();

        System.out.println("------------------获取私有构造方法-----------------");
        Constructor con1 = clazz.getDeclaredConstructor(String.class,Integer.class);//null
        System.out.println(con1);
        con1.setAccessible(true);/////////////////////////////
        Student student1 = (Student) con.newInstance();
        student.show();
    }

    /**
        B.成员变量Field
     */
    @Test
    public void test02() throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.加载类对象
        Class<?> clazz = Class.forName("com.niit.bean.Student");

        Field[] fileds = clazz.getDeclaredFields();//非公共成员
        for (Field f:fileds){
            System.out.println(f);
        }

        //使用私有成员
        Field field1 = clazz.getDeclaredField("name");
        field1.setAccessible(true);

        Constructor constructor = clazz.getConstructor();
        Student student = (Student) constructor.newInstance();
        //给私有成员指定调用的对象
        field1.set(student,"Nit4sh");////////////////////////////
        System.out.println(student.getName());
    }

    /**
     *  C.Method使用
     */
    @Test
    public void test03() throws Exception {
        //1.加载类对象
        Class<?> clazz = Class.forName("com.niit.bean.Student");

        System.out.println("---------------------获取自己及父类所有方法----------------");
        Method[] methods = clazz.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }

        System.out.println("---------------------获取自己所有方法----------------");
        Method[] methods1 = clazz.getDeclaredMethods();
        for(Method m : methods1){
            System.out.println(m);
        }

        System.out.println("---------------------获取普通成员方法----------------");
        Method m1 = clazz.getMethod("show");
        Constructor con = clazz.getConstructor();
        Object obj = con.newInstance();
        m1.invoke(obj);

        System.out.println("---------------------获取含参方法----------------");
        Method m2 = clazz.getMethod("method",String.class);
        m2.invoke(obj,"QQQ");

        System.out.println("---------------------使用带返回值方法----------------");
        Method m3 = clazz.getMethod("getString",String.class,int.class);
        String str1 = (String) m3.invoke(obj,"QQQ",12);
        String str2 = (String) m3.invoke(obj,"SSS",666);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("---------------------使用私有方法----------------");
        Method m4 = clazz.getDeclaredMethod("function");////////////私有含访问说明符private
        m4.setAccessible(true);
        m4.invoke(obj);
    }














}
