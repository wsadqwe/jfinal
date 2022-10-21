package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Username {

    @RequestMapping("/")
    public String halo(){
        return "index";
    }
}
