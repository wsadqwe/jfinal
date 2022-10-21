package com.niit.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl {
    @Autowired
    public void reduceMoney(JdbcTemplate jdbcTemplate){
        String sql="update tx_cs1_money set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"mu");
    }

    public void addMoney(JdbcTemplate jdbcTemplate){
        String sql="update tx_cs1_money set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"mu");
      }
}

