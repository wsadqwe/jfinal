package com.niit.service.impl;

import com.niit.dao.ComputerDAO;
import com.niit.dao.OrderDAO;
import com.niit.pojo.Order;
import com.niit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author
 * @Date 2022/10/6 14:44
 * @Description
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private ComputerDAO computerDAO;


    public int asignOrder(String goods, int num) {
        //1.计算总价
        int total = computerDAO.selectPrice(goods) * num;
        System.out.println("Service: 总价："+total);
        //2.生成订单
        Order order = new Order();
        order.setTotalPrice(total);
        order.setoNumber(1);
        //3.库存更新
        computerDAO.updateCompuiter(num);
        //4.存储订单
        System.out.println("Service: 存储订单");
        return orderDAO.saveOrder(order);
    }
}
