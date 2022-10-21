package com.niit.pojo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Author
 * @Date 2022/10/6 14:30
 * @Description
 **/
public class Computer {
    @Value("1")
    private int cid;
    private String cname;
    private int price;

    @Value("999")
    private long num;

    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public long getNum() {
        return num;
    }
    public void setNum(long num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
