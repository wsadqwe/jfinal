package com.niit.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author
 * @Date 2022/10/6 9:27
 * @Description
 **/
@Configuration
@ComponentScan(value = "com.niit.component")
public class MyConfig {

    @Bean(initMethod = "init")
    @Scope
    public User getUser1(){//方法名：name
        User user = new User();
        user.setName("李开复");
        return user;
    }

    @Bean(initMethod = "init")
    @Scope
    public User getUser2(){
        User user = new User();
        user.setName("吴军");
        return user;
    }
}
