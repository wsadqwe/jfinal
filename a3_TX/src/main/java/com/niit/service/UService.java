package com.niit.service;


import com.niit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class UService {

    @org.springframework.stereotype.Service
    @Transactional(propagation = Propagation.REQUIRED,isolation = )
    public static class UserService{
        @Autowired
        private UserDao userDao;


        public void accountMoney(){
            userDao.reduceMoney();

            int num=12/0;
            userDao.addMoney();
        }
    }
}
