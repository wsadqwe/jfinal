package com.niit.component;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Author
 * @Date 2022/10/6 8:44
 * @Description
 **/
public class User {
    private String name;

    @Value("55")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("init..........");
    }
}
