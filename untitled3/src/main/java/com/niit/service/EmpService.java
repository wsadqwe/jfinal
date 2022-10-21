package com.niit.service;

import com.niit.dao.EmpDao;
import com.niit.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpService {
    @Autowired
    private EmpDao empdao;
    public void saveEmp(Employee employee){
        empdao.add(employee);
        System.out.println("Service.SaveEmp()"+employee.toString());


    }
    public void updateEmp(Employee employee){
        empdao.update(employee);
        System.out.println("Service.SaveEmp()"+employee.toString());


    }
    public void deleteEmp(Employee employee){
        empdao.delete(employee);
        System.out.println("Service.SaveEmp()"+employee.toString());


    }
    public Employee selectEmp(int id){
        System.out.println("Service.SaveEmp()");
        return empdao.select(id);

    }
    public int count(){
        System.out.println("共有数据");
        return empdao.count();
    }

    public List All(){
        System.out.println("共有数据");
        return empdao.selectAll();
    }
}
