package com.niit.dao;

import com.niit.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private User user;

    public void insert(String name){
        user.setName(name);
        System.out.println("UserDao.insert已保存"+name);
    }
}
