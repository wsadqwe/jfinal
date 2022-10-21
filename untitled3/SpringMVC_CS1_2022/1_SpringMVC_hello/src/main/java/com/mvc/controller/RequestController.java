package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author
 * @Date 2022/10/20 14:17
 * @Description
 **/
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


    /**
     * @RequestMapping
     *         默认值 为 value
     *         可以不带 ‘/’
     *         value可以设置多个值 ‘或’
     */
    @RequestMapping("v")
    public String requestValue(){
        return "success";
    }

    @RequestMapping(value="v1")
    public String requestValue2(){
        return "success";
    }

    @RequestMapping(value= {"v2","v3"})
    public String requestValue3(){
        return "success";
    }

    /**
     *   method: get post
     *        -  设置method后，只能用指定请求方法访问该地址，否则405
     *        -
     *
     *         @RequestMapping
     *              @GetMapping == @RequestMapping(value="m2", method = RequestMethod.GET)
     *              @PostMapping == @RequestMapping(value="m2", method = RequestMethod.POST)
     *              @PutMapping  == @RequestMapping(value="m2", method = RequestMethod.PUT)
     *              @DeleteMapping  == @RequestMapping(value="m2", method = RequestMethod.DELETE)
     */
//    @RequestMapping(value="m1",
//            method = RequestMethod.GET)
    @GetMapping("m1")
    public String requestMethod(){
        return "success";
    }

//    @RequestMapping(value="m2",
//            method = RequestMethod.POST)
    @PostMapping("m2")
    public String requestMethod2(){
        return "success";
    }

    @RequestMapping(value="m3",
            method ={ RequestMethod.GET,RequestMethod.POST})
    public String requestMethod3(){
        return "success";
    }

    //非法方法出现时，默认以get方式发送请求
    @PutMapping("m4")
    public String requestMethod4(){
        return "success";
    }


    /**
     *  Params:通过请求参数匹配来请求映射
     *    {condition1,condition2}  设置多个条件时需要同时满足
     */
    @RequestMapping(value={"p1","p"},
            method ={ RequestMethod.GET,RequestMethod.POST},
            params = "username")
    public String requestParams1(){
        return "success";
    }

    @RequestMapping(value="p2",
            method ={ RequestMethod.GET,RequestMethod.POST},
            params = "username=admin")//url中差异
    public String requestParams2(){
        return "success";
    }

    @RequestMapping(value="p3",
            method ={ RequestMethod.GET,RequestMethod.POST},
            params = {"username=admin","pwd!=123"})
    public String requestParams3(){
        return "success";
    }

    /**
     *  headers
     *      要求请求头包含指定信息
     */
    @RequestMapping(value="h1",
            method ={ RequestMethod.GET,RequestMethod.POST},
            params = {"username=admin","pwd!=123"},
            headers = "Host=localhost:8083"
    )
    public String requestheaders(){
        return "success";
    }

    @RequestMapping(value="h2",
            method ={ RequestMethod.GET,RequestMethod.POST},
            params = {"username=admin","pwd!=123"},
            headers = "Host=localhost:8080"
    )
    public String requestheaders2(){
        return "success";
    }

}
