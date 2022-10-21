package com.niit.dao.daoimpl;

import com.niit.dao.UserDao;
import com.niit.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserEntity user;
    public void updateType(String type){
        System.out.println("已变更" );
        user.setType(type);
    }
}
