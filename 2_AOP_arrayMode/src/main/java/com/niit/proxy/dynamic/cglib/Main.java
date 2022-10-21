package com.niit.proxy.dynamic.cglib;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = (Cat) new ProxyObject(cat).getProxyInstance();

    }
}

