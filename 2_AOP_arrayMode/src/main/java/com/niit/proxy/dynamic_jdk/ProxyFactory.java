package com.niit.proxy.dynamic_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    //生成代理对象（包含被代理对象方法的扩展/增强）

    public Object getProxyNewInstance(){
        //基于JDK内部接口实现对target的增强
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    //此场景进行方法增强
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("有妈的孩纸像块宝");//增强
                        Object returnValue = method.invoke(target,args);
                        System.out.println("妈妈的怀抱最温暖了");//增强

                        return returnValue;
                    }
                }
        );
    }

    //Method method;
    //returnVal = method.invoke(obj,args);模拟出来的



}
