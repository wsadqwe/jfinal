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
		//1.����Session
		Session se = HibernateUtil.getSession();
		//2.��������
//		se.beginTransaction();
		Transaction tx = se.beginTransaction();
		//3.��������
		Ikun i1 = new Ikun(2,"qqq");
		se.save(i1);//���ORM
		//4.�����ύ
//		se.getTransaction().commit();
		tx.commit();
		//5.�ر�Session
		se.close();
	}

}
