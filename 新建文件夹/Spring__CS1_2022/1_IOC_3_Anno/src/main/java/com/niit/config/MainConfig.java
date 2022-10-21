package com.niit.config;

import com.niit.pojo.Computer;
import com.niit.pojo.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author
 * @Date 2022/10/6 15:13
 * @Description
 **/
@Configuration
@ComponentScan(value = "com.niit")
public class MainConfig {

    @Bean
    public Order getOrder() {
        Order order = new Order();
        order.setoNumber(123);
        order.setTotalPrice(55555);
        return order;
    }

    @Bean
    public Computer getComputer() {
        Computer computer = new Computer();
        computer.setCname("Huawei");
        computer.setPrice(6666);
        return computer;
    }
}
