package com.niit.aspect;

/**
 * @Author
 * @Date 2022/10/7 19:40
 * @Description
 **/
public class Lion {
    private String name;

    public String getName() {
        System.out.println("读取Name");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void throwException1(){
        System.out.println("抛出异常");
        throw new IllegalArgumentException();
    }

}
