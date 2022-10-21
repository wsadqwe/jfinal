/**
 * 
 */
package com.niit.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @Author Matr1x
 * @ProjectName H_ch1_CS1_save
 * @Manba >>>Thinking twice,Code Once>>
 * @Description
 * @Date Sep 2, 2022 2:33:59 PM
 */
public class HibernateUtil {

	static SessionFactory sf;

	static {
		try {
			sf = new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}
	
	public static Session getSession() {
		return sf.openSession();
	}
}
