package com.niit.test;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author
 * @Date 2022/9/29 8:47
 * @Description
 **/
public class LoadClassFromDocTest {
    @Test
    public void testLoad() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.加载文件
        File file = new File("D:\\CodeProjects\\JavaIDEAProjects\\Java_CS1_Reflection\\reflection\\src\\main\\resources\\properties.txt");
        //2.读取数据
        Properties config = new Properties();
        config.load(new FileInputStream(file));
        String classPath = (String) config.get("class");
        String methodName = (String) config.get("method");

        //3.反射加载类
        Class clazz = Class.forName(classPath);
        //4.获取方法对象
        Method method = clazz.getMethod(methodName);
        //5.获取构造器生成Student对象
        Constructor constructor = clazz.getConstructor();
        Object obj = constructor.newInstance();
        //6.让method被某对象调用
        method.invoke(obj);
    }
}
