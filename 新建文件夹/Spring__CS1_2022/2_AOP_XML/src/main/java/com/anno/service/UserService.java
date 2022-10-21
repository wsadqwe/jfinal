package com.anno.service;

import com.anno.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author
 * @Date 2022/10/10 20:20
 * @Description
 **/
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void save(String name){
        System.out.println("UserService.save()   -"+name);
        userDao.insert(name);
    }
}
