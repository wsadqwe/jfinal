package com.niit.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author
 * @Date 2022/10/7 14:57
 * @Description
 **/
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    //生成代理对象（包含对被代理对象方法的扩展/增强）
    public Object getProxyNewInstance(){
        //基于JDK内部接口实现对target的增强
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler(){
                    //此场景进行方法增强
                    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                        System.out.println("算命大师说于世华2022会为情所困:");////////////增强
                        Object returnValue = method.invoke(target,args);
                        System.out.println("什么情？疫情");///////////增强
                        return returnValue;
                    }
                }
        );
    }
}
