package com.niit.dao;

import com.niit.pojo.Order;

/**
 * @Author
 * @Date 2022/10/6 14:35
 * @Description
 **/
public interface OrderDAO {
    public Order selectOrder(int orderNum);
    public int saveOrder(Order order);
}
