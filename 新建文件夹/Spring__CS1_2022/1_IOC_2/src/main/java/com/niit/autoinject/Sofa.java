package com.niit.autoinject;

/**
 * @Author
 * @Date 2022/10/6 8:28
 * @Description
 **/
public class Sofa {
    private String brand;

    @Override
    public String toString() {
        return "Sofa{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
