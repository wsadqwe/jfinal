package com.niit.dao;

import com.niit.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author
 * @Date 2022/10/13 8:27
 * @Description
 **/
@Repository
public class UserDao {
    @Autowired
    private User user;

    public void updateType(String type){
        System.out.println("用户类型已更新");
        user.setType(type);
    }
}
