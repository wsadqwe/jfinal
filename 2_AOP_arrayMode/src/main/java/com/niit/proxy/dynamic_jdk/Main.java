package com.niit.proxy.dynamic_jdk;

public class Main {
    public static void main(String[] args) {
        IACTest ac = new ACTestImpl();
        IACTest ac1 = (IACTest) new ProxyFactory(ac).getProxyNewInstance();
        ac1.checkACTest();
        //ac1.doACTest();

        //IACTest ac2 = (IACTest) new ProcyObject(ac).getProxyNewInstance();
        //ac2.doACTest();
    }
}
