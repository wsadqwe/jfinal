package com.niit.dao;

import com.niit.entity.Employee;

import java.util.List;

public interface EmpDao {
    void add(Employee emp);
    void update(Employee emp);
    void delete(Employee emp);

    int count();
    Employee select(int id);
    List selectAll();
}
