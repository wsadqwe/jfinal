package com.niit.dao.impl;

import com.niit.dao.OrderDAO;
import com.niit.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author
 * @Date 2022/10/6 14:37
 * @Description
 **/
@Repository("orderrrrrrrrrrr")
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    private Order order;

    public Order selectOrder(int orderNum) {
        System.out.println(order.toString());
        return order;
    }

    public int saveOrder(Order order) {
        System.out.println("OrderDao: 订单已存储"+order.toString());
        return 666;
    }
}
