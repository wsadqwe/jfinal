package com.niit.proxy.dynamic.jdk;

/**
 * @Author
 * @Date 2022/10/7 15:13
 * @Description
 **/
public class Main {
    public static void main(String[] args) {
        IACTest ac = new ACTestImpl();
//        IACTest ac1 = (IACTest) new ProxyFactory(ac).getProxyNewInstance();
        IACTest ac1 = (IACTest) new ProxyObject(ac).getProxyNewInstance();
        ac1.doACTest();
    }
}
