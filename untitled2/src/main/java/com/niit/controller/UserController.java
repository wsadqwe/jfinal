package com.niit.controller;


import com.niit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    UserService service;

    public void setUserType(String type){
        System.out.println("service变更");
        service.update(type);
    }

}
