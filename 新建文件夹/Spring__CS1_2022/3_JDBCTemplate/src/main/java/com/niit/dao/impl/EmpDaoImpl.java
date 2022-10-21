package com.niit.dao.impl;

import com.niit.dao.EmpDao;
import com.niit.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author
 * @Date 2022/10/13 14:19
 * @Description
 **/
@Repository
public class EmpDaoImpl implements EmpDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(Employee emp) {
        String sql = "insert into jdbc_cs1_emp values(?,?,?)";//列名未出现
        Object[] args = {emp.getEid(),emp.getEname(),emp.getEsalary()};
        jdbcTemplate.update(sql,args);
    }

    public void update(Employee emp) {
        String sql = "update jdbc_cs1_emp set ename=?,salary=? where eid=?";
        Object[] args = {emp.getEname(),emp.getEsalary(),emp.getEid()};
        System.out.println(jdbcTemplate.update(sql,args));
    }

    public void delete(Employee emp) {
        String sql = "delete from jdbc_cs1_emp where eid=?";
        Object[] args = {emp.getEid()};
        System.out.println(jdbcTemplate.update(sql,args));
    }

    public Employee select(int id) {
        String sql = "select * from jdbc_cs1_emp where eid=?";
        Object[] args = {id};
        Employee employee =
                jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Employee>(Employee.class),args);
        return employee;
    }
    public int count() {
        String sql = "select count(*) from jdbc_cs1_emp";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    public List selectAll() {
        String sql = "select * from jdbc_cs1_emp";

        //批量增删改
        //List<Object[]> args
//        jdbcTemplate.batchUpdate(sql,args);

        List<Employee> list =
                jdbcTemplate.query(sql,new BeanPropertyRowMapper<Employee>(Employee.class));
        return list;
    }



}
