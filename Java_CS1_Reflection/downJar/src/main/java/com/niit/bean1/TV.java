package com.niit.bean1;

/**
 * @Author
 * @Date 2022/9/30 20:08
 * @Description
 **/
public class TV {

    private String brand;
    private float price;

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
