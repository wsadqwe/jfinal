package com.niit.pojo;

import lombok.Data;
import lombok.ToString;

/**
 * @Author
 * @Date 2022/10/14 19:33
 * @Description
 **/
@ToString
@Data
public class User {
    private int id;
    private String username;
    private int money;
}
