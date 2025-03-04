package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Empone e1 = new Empone();
		Empone e2 = new Empone();
		
		
		
		e1.setEid(11);
		e1.setName("ganesh");
		
		
		e2.setEid(12);
		e2.setName("mohit");
		
		project p1 = new project();
		project p2 = new project();
		p1.setPid(1112);
		p1.setProjectname("Liber mangemet System");
		p2.setPid(1211);
		p2

		s.close();
		tx.commit();

	}
}
