package com.niit.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Author
 * @Date 2022/10/6 8:44
 * @Description
 **/
//@Component("daooooooooooo")
//@Controller
@Repository
public class UserDao {

//    @Autowired
//    @Qualifier(value = "getUser2")
//    @Resource//byType
    @Resource(name = "getUser2")
    private User user;

    public User selectUser(){
        System.out.println("User 已获取");
//        user.setAge(60);
        return user;
    }
}
