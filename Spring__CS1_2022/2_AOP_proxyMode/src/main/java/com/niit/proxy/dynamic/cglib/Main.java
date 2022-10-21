package com.niit.proxy.dynamic.cglib;

/**
 * @Author
 * @Date 2022/10/7 19:09
 * @Description
 **/
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = (Cat) new ProxyObject(cat).getProxyInstance();
        cat1.maio();
    }
}
