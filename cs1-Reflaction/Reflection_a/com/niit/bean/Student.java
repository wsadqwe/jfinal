package com.niit.bean;

public class Student {
    private String id;
    private String name;
    private String sex;
    private Integer age;

    public Student(){}

    /**
     * 单参构造
     * @param id
     */
    public Student(String id) {
        this.id = id;
    }

    /**
     * 多个参数的构造
     * @param id
     * @param name
     * @param sex
     * @param age
     */
    public Student(String id, String name, String sex, Integer age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 受保护的构造方法
     * @param name
     * @param sex
     */
    protected Student(String name,String sex){
        this.name = name;
        this.sex = sex;
    }

    /**
     * 私有构造方法
     * @param name
     * @param age
     */
    private Student(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void show(){
        System.out.println("show方法的输出");
    }

    public void method(String s){
        System.out.print("method方法的输出");
    }

    public String getString(String s,int i){
        return s +"---"+i;
    }

    private void function(){
        System.out.println("function方法的输出");
    }

    public static void main(String[] args) {
        System.out.println("main方法被执行了！");
        for(String s:args){
            System.out.println("输出："+s);
        }
    }
}
