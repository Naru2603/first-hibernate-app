package com.basic.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.basic.entity.Student;


public class TestHibernateApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student std = new Student();
		std.setRoll(21);
		std.setName("Rahul");
		std.setAddress("Pune");
		
	
		//step 1- create configuration
		
		Configuration conf = new Configuration();
		
		conf.configure();
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(std);
		
		txn.commit();
		
		System.out.println("Student object saved to DB successfully..!!!!");
		
		session.close();
		
		

	}

}
