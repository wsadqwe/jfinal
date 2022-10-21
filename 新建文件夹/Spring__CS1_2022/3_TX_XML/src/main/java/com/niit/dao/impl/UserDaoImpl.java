package com.niit.dao.impl;

import com.niit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author
 * @Date 2022/10/14 19:36
 * @Description
 **/
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void reduceMoney() {
        String sql = "update tx_cs1_money set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"zhoubo");
    }

    public void addMoney() {
        String sql = "update tx_cs1_money set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"majun");
    }
}
