package com.niit.proxy.staticmode;

/**
 * @Author
 * @Date 2022/10/7 14:37
 * @Description
 **/
public class Main {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();
        BookDao bookDao1 = new BookDaoProxy(bookDao);
        bookDao1.add();
        System.out.println("---------------");
        bookDao1.update();
    }
}
