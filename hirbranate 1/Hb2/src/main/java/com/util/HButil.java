package com.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class HButil {
	private static SessionFactory sf= new Configuration().setProperties(P1())
			.addAnnotatedClass(Student.class)
			.buildSessionFactory();	
	
	private static Properties P1() {
		Properties p = new Properties();
		p.setProperty("hibernate.connection.driver_class ", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/lokesh");
		p.setProperty("hibernate.connection","root");
		p.setProperty("hibernate.connection", "root@123");
		p.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL%Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");
		
		return p;
	} 
	public  static SessionFactory getFSessionFactory() {
		return sf;
	 
	}
	 
}
