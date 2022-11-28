package com.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * url接口    htpp动作      操作
 * /user/1      get         查询特定
 * /user        get         查询所有
 * /user        Post        保存新用户
 * /user        Post
 * /user        Put
 * /user/1      delete
 */
@Controller
public class RSTController {

    @RequestMapping("rest")
    public String rest1(){
        return "rest";
    }
    @RequestMapping("user/{id}")
    public String getUserByID(@PathVariable("id")Integer uid){
        System.out.println("Get方法查询特定 " +uid);
        return "success";
    }
    @RequestMapping("user")
    public String getAllUser() {
        System.out.println("Get方法查询所有 ");
        return "success";
    }
    @PostMapping("user")
    public String saveUser(String user,String pwd){
        System.out.println("Post保存新用户" +user+ "|" +pwd);
        return "success";
    }
    @PutMapping("user")
    public String updateUser(String user,String pwd){
        System.out.println("Put更新用户" +user+ "|" +pwd);
        return "success";
    }
    @DeleteMapping("user/{id}")
    public String deleteUserById(@PathVariable("id")Integer uid){
        System.out.println("Delete删除新用户" +uid);
        return "success";
    }
}
