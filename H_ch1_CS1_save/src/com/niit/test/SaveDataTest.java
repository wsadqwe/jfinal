package com.niit.test;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.niit.pojo.Ikun;
import com.niit.util.HibernateUtil;

public class SaveDataTest {

	@Test
	public void test() {
		//1.开启Session
		Session se = HibernateUtil.getSession();
		//2.开启事务
//		se.beginTransaction();
		Transaction tx = se.beginTransaction();
		//3.保存数据
		Ikun i1 = new Ikun(2,"qqq");
		se.save(i1);//完成ORM
		//4.事务提交
//		se.getTransaction().commit();
		tx.commit();
		//5.关闭Session
		se.close();
	}

}
