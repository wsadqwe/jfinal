package com.niit.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @Author
 * @Date 2022/10/6 8:44
 * @Description
 **/
//@Component
@Controller
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public  User getUser(){
        System.out.println("service User已处理");
        return userDao.selectUser();
    }
}
