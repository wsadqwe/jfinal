package com.mvc.controller;

import com.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ReceiveController {
    @RequestMapping("/recHttpArgs")
    public String recHttpParam(HttpServletRequest req){
        String user=req.getParameter("username");
        String pwd=req.getParameter("password");
        System.out.println("HttpServletRequest:+"+user+" | "+pwd);
        return "success";
    }


    @RequestMapping("recPathVariable/{id}{card}")
    public String reqPathVariable(@PathVariable("id")String uid,@PathVariable("card")String num){
        System.out.println("PathVariable:+"+uid+" | "+num);
        return "success";
    }


    @RequestMapping("/recmethodargs")
    public String reqMethodargs(String username,String password){
        System.out.println(":"+username+" | "+password);
        return "success";
    }

    @RequestMapping("/recparam")
    public String requestParam(String username,String password){
        System.out.println(":"+username+" | "+password);
        return "success";
    }

    @RequestMapping("/recparam2")
    public String requestParam2(@RequestParam("user") String username,
                                @RequestParam(value="pwd",required=false)String password){
        System.out.println(":"+username+" | "+password);
        return "success";
    }
    @RequestMapping("/recparam3")
    public String requestParam3(@RequestParam("user") String username,
                                @RequestParam(value="pwd",required=false,defaultValue = "it's secret")String password){
        System.out.println(":"+username+" | "+password);
        return "success";
    }
    @RequestMapping("/recparam4")
    public String requestParam4(
            @RequestParam("user") String username,
            @RequestParam(value="pwd",required=false,defaultValue = "it's secret")String password,
            @RequestHeader("User-Agent")String info,
            @CookieValue("JSESSIONID")String JSESSIONID){
        System.out.println(":"+username+" | "+password+" | "+info);
        System.out.println(" "+JSESSIONID);
        return "success";
    }

    @RequestMapping("/recparam5")
    public String requestParam5(
            @RequestParam("user") String username,
            @RequestParam(value="pwd",required=false,defaultValue = "it's secret")String password,
            @RequestHeader("User-Agent")String info,
            @CookieValue("JSESSIONID")String JSESSIONID,
            @CookieValue(value="guess",required=false,defaultValue="QQQ")String answer,
            @RequestHeader(value="guess2",required=false,defaultValue="QQQ")String notfound){
        System.out.println(":"+username+" | "+password+" | "+info);
        System.out.println(" "+JSESSIONID);
        return "success";
    }

    @RequestMapping("recbean")
    public String recEntity(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("recbean2")
    public String recEntity2(@ResponseBody User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("recbean3")
    @ResponseBody
    public String recEntity3(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("recbean4")
    @ResponseBody
    public User recEntity4(User user){
        System.out.println(user);
        return user;
    }
}
