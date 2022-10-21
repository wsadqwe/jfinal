package com.niit.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author
 * @Date 2022/10/17 19:15
 * @Description
 **/

@Configuration//<beans> == bean.xml
@ComponentScan("com.niit.*")//<context:component-scan>
@EnableTransactionManagement//<tx:annotation-driven>
public class TxConfit {
    /**
     * 1.DataSource  --- Druid
     * 2.JdbcTemplate
     * 3.TxManager
     */
    @Bean
    public DataSource getDataSource() {
        DruidDataSource druid = new DruidDataSource();
        druid.setUrl("jdbc:mysql://localhost:3306/miit_text");
        druid.setUsername("root");
        druid.setPassword("123456");
        druid.setDriverClassName("com.mysql.jdbc.Driver");
        return druid;
    }
    /**
     *  注入：
     *  1.调用配置类方法
     *  2.IOC自动注入
     */
    @Bean
    public JdbcTemplate getJdbc(DataSource dataSource){
//        return new JdbcTemplate(getDataSource());
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public DataSourceTransactionManager getTxM(DataSource dataSource){
//        return new DataSourceTransactionManager(getDataSource());
        return new DataSourceTransactionManager(dataSource);
    }

}
