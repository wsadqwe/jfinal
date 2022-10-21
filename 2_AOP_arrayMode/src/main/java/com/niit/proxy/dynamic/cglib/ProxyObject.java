package com.niit.proxy.dynamic.cglib;


import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyObject implements MethodInterceptor {


    private Object target;

    public ProxyObject(Cat cat){
        this.target = target;
    }

    /*借助工具类来生成代理对象--子类对象*/

    public Object getProxyInstance(){
        //1.创建工具类对象
        Enhancer enhancer = new Enhancer();
        //2.设置目标对象为代理对象的父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.生成子类对象
        return enhancer.create();

    }


    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("算命大师说于世华2022会为情做困");//增强
        Object returnValue = method.invoke(target, args);
        System.out.println("什么情？疫情");//增强
        return returnValue;

    }
}
