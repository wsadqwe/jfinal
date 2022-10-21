package com.niit.service;

import com.niit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void save(String name){
        System.out.println("UserService.save()  "+name);
        userDao.insert(name);
    }
}
