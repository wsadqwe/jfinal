package com.niit.bean;

/**
 * @Author
 * @Date 2022/9/30 19:35
 * @Description
 **/
public class Computer {

    private float price;
    private String cpu;
    private String display;
    private String os;

    public Computer(){}

    public Computer(float price, String cpu, String display, String os) {
        this.price = price;
        this.cpu = cpu;
        this.display = display;
        this.os = os;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", cpu='" + cpu + '\'' +
                ", display='" + display + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
