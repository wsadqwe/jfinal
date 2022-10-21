package com.niit.proxy.staticmode;

/**
 * @Author
 * @Date 2022/10/7 14:30
 * @Description
 **/
public class BookDaoImpl implements BookDao{

    public void add() {
        System.out.println("添加一本书");
    }

    public void delete() {
        System.out.println("删除一本书");
    }

    public void update() {
        System.out.println("更新一本书");
    }

    public String select() {
        System.out.println("查询一本书");
        return null;
    }
}
