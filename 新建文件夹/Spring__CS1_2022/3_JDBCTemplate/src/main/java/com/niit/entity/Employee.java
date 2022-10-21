package com.niit.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @Author
 * @Date 2022/10/13 14:15
 * @Description
 **/
@ToString
@Data
public class Employee {
    private int eid;
    private String ename;
    private double esalary;
}
