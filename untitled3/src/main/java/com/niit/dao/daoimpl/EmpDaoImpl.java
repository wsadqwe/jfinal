package com.niit.dao.daoimpl;

import com.niit.dao.EmpDao;
import com.niit.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.rowset.JdbcRowSet;
import java.util.List;

@Repository
public class EmpDaoImpl implements EmpDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(Employee emp) {
        String sql="insert into jdbc_cs1 emp value(?,?,?)";
        //准备数据
        Object[] args={emp.getEid(),emp.getEname(),emp.getEsalary()};
        //执行函数
        jdbcTemplate.update(sql,args);
    }

    public void update(Employee emp) {
        String sql="update jdbc_cs1 set ename=?,salary=? where eid=?";
        //准备数据
        Object[] args={emp.getEname(),emp.getEsalary(),emp.getEid()};
        //执行函数
        System.out.println(jdbcTemplate.update(sql,args));
    }

    public void delete(Employee emp) {
        String sql="delete form emp set where eid=?";
        //准备数据
        Object[] args={emp.getEid()};
        //执行函数
        System.out.println(jdbcTemplate.update(sql,args));
    }

    public int count() {
        String sql="select count(*) from niit_text";

        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    public Employee select(int id) {
        String sql="select * from emp where eid=?";
        Object[] args={id};
        Employee employee=
                jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Employee>(Employee.class),args);
        return employee;
    }

    public List selectAll() {
        String sql="select * from emp";
        List<Employee> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<Employee>(Employee.class));
        return list;
    }


}
