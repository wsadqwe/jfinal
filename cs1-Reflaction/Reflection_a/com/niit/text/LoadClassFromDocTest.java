package com.niit.text;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.util.Properties;

public class LoadClassFromDocTest {
    @Test
    public void test01(){
        //1.加载文件
        File file=new File();
        //2.读取数据
        Properties config=new Properties();
        config.load(new.FileInputStream(File));
        String.classPath=(String)config.get("class");
        String methodName=(String)config.get("method");
        //3.反射加载类
        Class cs1=Class.forName(classPath);
        //4.获取方法对象
        Method method=cs1.getMethod(methodName);
        //5.获取构造器生成Studen对象
        Constructor constructor=cs1.getConstructor();
        Object ob1=constructor.newInstance();
        //6.method被某对象调用
        method.invoke(obj);

    }



}
