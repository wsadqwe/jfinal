package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author
 * @Date 2022/10/20 9:36
 * @Description
 **/

@Controller
public class HelloController {

    //handler
    @RequestMapping("/")
    public String halo(){
        return "index";
    }
}
