package com.niit.pojo;

/**
 * @Author
 * @Date 2022/10/6 14:30
 * @Description
 **/
public class Order {
    private int oNumber;
    private int totalPrice;

    public int getoNumber() {
        return oNumber;
    }
    public void setoNumber(int oNumber) {
        this.oNumber = oNumber;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    @Override
    public String toString() {
        return "Order{" +
                "oNumber=" + oNumber +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
