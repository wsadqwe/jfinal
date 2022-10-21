package com.niit.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class TxConfig {
    /**
     * 1.DataBase
     * 2.JdbcTemplate
     * 3.TxManager
     */
    @Bean
    public DataSource getDataSource(){
        DruidDataSource druid=new DruidDataSource();
        druid.setUrl("jdbc:mysql:localhost:3306/niit_text");
        druid.setUsername("root");
        druid.setPassword("123456");
        druid.setDriverClassName("com.mysql.jdbc.Driver");
        return druid;
    }

    /**
     * 注入：
     * 1.调用配置方法
     * 2.IOC自动注入
     * @return
     */
    @Bean
    public JdbcTemplate getJdbc(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
    @Bean
    public DataSourceTransactionManager getTxM(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

}
