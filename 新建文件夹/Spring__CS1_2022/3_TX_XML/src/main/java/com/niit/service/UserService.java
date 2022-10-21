package com.niit.service;

import com.niit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

/**
 * @Author
 * @Date 2022/10/14 19:47
 * @Description
 **/
@Service
//@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

//    DataSourceTransactionManager s;

    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.READ_COMMITTED,noRollbackFor = ArithmeticException.class)
    public void accountMoney(){
        userDao.reduceMoney();
        ///生成异常
        int num = 12/0;
//        userDao.addMoney();
        addMoney();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW,
            rollbackFor = {ArithmeticException.class, FileNotFoundException.class})
    public void addMoney(){
        userDao.addMoney();
    }
}
