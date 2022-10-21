package com.niit.lifecycle;

import org.springframework.beans.factory.DisposableBean;

/**
 * @Author
 * @Date 2022/10/3 20:14
 * @Description
 **/
public class Cola implements DisposableBean {
    private String brand;

    public Cola(){
        System.out.println("1.创建bean实例");
    }

    public String getBrand() {
        System.out.println("4.使用bean对象");
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("2.设置bean属性值");
        this.brand = brand;
    }

    public void init(){
        System.out.println("3.bean初始化完成");
    }

    public void destroy() throws Exception {
        System.out.println("5.销毁Bean实例");
    }

//    public void destroy(){
//        System.out.println("5.销毁Bean实例");
//    }
}
