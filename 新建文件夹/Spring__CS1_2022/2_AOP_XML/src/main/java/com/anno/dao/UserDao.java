package com.anno.dao;

import com.anno.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author
 * @Date 2022/10/10 20:18
 * @Description
 **/
@Repository
public class UserDao {

    @Autowired
    private User user;

    public void insert(String name){
        user.setName(name);
        System.out.println("UserDao.insert已保存:"+name);
    }
}
