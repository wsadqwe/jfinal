package com.niit.config;

import com.niit.entity.UserEntity;
import com.niit.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


    @Configuration
    @ComponentScan("com.niit")
    @EnableAspectJAutoProxy
    public class MainConfig {
        @Bean
        public UserEntity user1(){
            return (new UserEntity());
        }

}
