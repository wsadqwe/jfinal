package com.niit.service;

import com.niit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author
 * @Date 2022/10/13 8:27
 * @Description
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void update(String type){
        System.out.println("Service:请修改用户类型为："+type);
        userDao.updateType(type);
    }
}
