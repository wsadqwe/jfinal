package com.niit.aspect;

public class lion {
    private String name;

    public String getName() {
        System.out.println("读取Name");
        return name;
    }

    public void setName(String name) {
       // System.out.println("写入Name");
        this.name = name;
    }

    public void throwException1(){
        System.out.println("抛出异常");
        throw new IllegalArgumentException();
    }
}
