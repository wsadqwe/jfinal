package org.example.com.niit.config;


import org.example.com.niit.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example.com.niit")
@EnableAspectJAutoProxy
public class MainConfig {
    @Bean
    public User user1(){
        return (new User());
    }
}
