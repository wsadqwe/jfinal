package com.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @RequestMapping
 *  默认值value
 *  可以不带‘/’
 *  value可以设置多个值‘或’
 */
@Controller
@RequestMapping("/req")
public class RequestController {
    public String returnIndex(){
        return "success";
    }

@RequestMapping("/location")
    public String returnIndex2(){
        return "success";
    }
    @RequestMapping("v")
    public String requestValue(){
        return "success";
    }

    @RequestMapping("v1")
    public String requestValue1(){
        return "success";
    }
    @RequestMapping("v1")
    public String requestValue2(){
        return "success";
    }
    @RequestMapping(value={"v1","v3"})
    public String requestValue3(){
        return "success";
    }

    /**
     * @RequestMapping(value="m1",method = RequestMethod.GET)
     * @GetMapping(value="m1",method = RequestMethod.GET)
     * @RequestMapping(value="m1",method = RequestMethod.GET)
     * @DeleteMapping(value="m1",method = RequestMethod.GET)
     * @return
     */
   // @RequestMapping(value="m1",method = RequestMethod.GET)
    @GetMapping("m1")
    public String requestMethod1(){
        return "success";
    }
    //@RequestMapping(value="m2",method = RequestMethod.POST)
    @PostMapping ("m2")
    public String requestMethod2(){
        return "success";
    }
    @RequestMapping(value="m3",method = {RequestMethod.GET,RequestMethod.POST})
    public String requestMethod3(){
        return "success";
    }
    @PutMapping ("m4")
    public String requestMethod4(){
        return "success";
    }

    /**
     * Params:通过请求参数匹配来请求映射
     * {condition1，condition2}设置多个条件时，必须同时满足
     */
    @RequestMapping(value={"p1","p2"},
        method={RequestMethod.GET,RequestMethod.POST},
            params="username='admin'")
    public String requestParams1(){
        return "success";
    }
    @RequestMapping(value="p2",
            method={RequestMethod.GET,RequestMethod.POST},
            params="username='admin'")
    public String requestParams2(){
        return "success";
    }
    @RequestMapping(value="p3",
            method={RequestMethod.GET,RequestMethod.POST},
            params={"username=admin","pwd!=123"})
    public String requestParams3(){
        return "success";
    }

    /**
     * headers
     *      要求请求头包含指定信息
     */
    @RequestMapping(value="h1",
            method={RequestMethod.GET,RequestMethod.POST},
            params = {"username=admin","pwd!=123"},
            headers="Host=localhost:8080")
    public String requesthraders1(){
        return "success";
    }

    @RequestMapping(value="h2",
            method={RequestMethod.GET,RequestMethod.POST},
            params = {"username=admin","pwd!=123"},
            headers="Host=localhost:8083")
    public String requesthraders2(){
        return "success";
    }
}
