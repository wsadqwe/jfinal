package com.niit.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

public class Test01 {
    @Test
            public void Testone()throws Exception{
        ApplicationContext context=new ClassPathXmlAoolicationContext()
                Cola cola =context.getBean(Cola.class);
        System.out.println(cola.getBrand());
        cola.destory();
        Cola cola2 =context.getBean(Cola.class);
        system.out.println(cola2.getBean());
    }
}
