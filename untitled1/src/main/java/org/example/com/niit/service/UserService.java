package org.example.com.niit.service;


import org.example.com.niit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.AuthProvider;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void update(String type){
        System.out.println("Service:请修改用户类型："+type);
        userDao.updateType(type);
    }
}
