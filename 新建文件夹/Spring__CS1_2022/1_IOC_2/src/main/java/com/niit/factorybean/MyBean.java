package com.niit.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author
 * @Date 2022/10/3 19:57
 * @Description
 **/
public class MyBean implements FactoryBean<Course> {

    public Course getObject() throws Exception {
        Course course = new Course();
        course.setcName("编译原理");
        return course;
    }

    public Class<?> getObjectType() {
        return Course.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
