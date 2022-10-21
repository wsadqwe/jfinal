package com.niit.service;

import com.niit.dao.EmpDao;
import com.niit.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author
 * @Date 2022/10/13 14:36
 * @Description
 **/
@Service
public class EmpService {
    @Autowired
    private EmpDao empDao;

    public void saveEmp(Employee employee){
        empDao.add(employee);
        System.out.println("Service.SaveEmp()"
                +employee.toString());
    }

    public void updateEmp(Employee employee){
        empDao.update(employee);
        System.out.println("Service.updateEmp()"
                +employee.toString());
    }

    public void deleteEmp(Employee employee){
        empDao.delete(employee);
        System.out.println("Service.deleteEmp()"
                +employee.toString());
    }

    public Employee selectEmp(int id){
        System.out.println("Service.selectEmp");
        return empDao.select(id);
    }

    public int slectCount(){
        System.out.println("Service.selectCount:共计数据");
        return empDao.count();
    }

    public List slectAll(){
        System.out.println("Service.selectAll");
        return empDao.selectAll();
    }
}
