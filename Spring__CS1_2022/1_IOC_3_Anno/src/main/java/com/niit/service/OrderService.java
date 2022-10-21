package com.niit.service;

/**
 * @Author
 * @Date 2022/10/6 14:42
 * @Description
 **/
public interface OrderService {
    //下订单* 商品名称 数量
    public int asignOrder(String goods,int num);
}
