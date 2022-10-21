package com.niit.dao.impl;

import com.niit.dao.ComputerDAO;
import com.niit.pojo.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author
 * @Date 2022/10/6 14:40
 * @Description
 **/
@Repository
public class ComputerDAOImpl implements ComputerDAO {

    @Autowired
    private Computer computer;

    public void updateCompuiter(int num) {
        computer.setNum(computer.getNum()-num);
        System.out.println("ComputerDao: 更新后商品信息"+computer.toString());
    }

    public int selectPrice(String goods) {
        return computer.getPrice();
    }
}
