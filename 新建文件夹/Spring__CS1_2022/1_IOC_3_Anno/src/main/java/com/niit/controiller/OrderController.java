package com.niit.controiller;

import com.niit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author
 * @Date 2022/10/6 14:45
 * @Description
 **/
@Controller("controllerrrrrrrrrrrrr")
public class OrderController {

    @Autowired
    private OrderService orderService;

    public void buyOrder(String goods,int num){
        System.out.println("Controller 下订单：购买"+goods+" 数量："+num);
        int info = orderService.asignOrder(goods,num);
        System.out.println("Controller 订单信息："+info);
    }
}
