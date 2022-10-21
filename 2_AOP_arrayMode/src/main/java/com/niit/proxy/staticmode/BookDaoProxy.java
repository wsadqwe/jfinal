package com.niit.proxy.staticmode;

import java.util.Date;

/*每一个被代理类都需要实现一个代理类Proxy （121一对一实现）
*       冗余代码，若增强10个类，就写10个代理类？
* */
public class BookDaoProxy implements BookDao{

    private  BookDao bookDao;

    public BookDaoProxy(BookDao dao){
        this.bookDao = dao;
    }

    public void log(){
        System.out.println("记录日志："+new Date());
    }

    public void add() {
        bookDao.add();
        log();
    }

    public void delete() {
        bookDao.delete();
        log();
    }

    public void update() {
        bookDao.update();
        log();
    }

    public String select() {
        bookDao.select();
        log();
        return null;

    }
}
