package org.example.com.niit.dao;


import org.example.com.niit.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private User user;
    public void updateType(String type){
        System.out.println("已变更" );
        user.setType(type);
    }
}
