package com.niit.config;

import com.niit.pojo.User;
import org.springframework.context.annotation.*;

/**
 * @Author
 * @Date 2022/10/13 8:28
 * @Description
 **/
@Configuration
@ComponentScans(
        value={@ComponentScan("com.niit.aspect"),
                @ComponentScan("com.niit.dao"),
                @ComponentScan("com.niit.service")
        }
)
@EnableAspectJAutoProxy/////////开启自动代理
public class MainConfig {

    @Bean
    public User user1(){
        return (new User());
    }
}
