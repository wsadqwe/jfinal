package com.niit.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @Author
 * @Date 2022/10/6 8:43
 * @Description
 **/
//@Component
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void reqUser(){
        System.out.println("user已请求");
        User user = userService.getUser();
        System.out.println("user已获取"+user.getName()+" "+user.getAge() );
    }

}
