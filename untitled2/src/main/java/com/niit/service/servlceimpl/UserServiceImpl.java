package com.niit.service.servlceimpl;

import com.niit.dao.daoimpl.UserDaoImpl;
import com.niit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl userDaoImpl;
    public void update(String type){
        System.out.println("Serviceq:请修改用户类型："+type);
        userDaoImpl.updateType(type);
    }
}
