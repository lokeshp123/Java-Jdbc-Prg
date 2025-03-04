package com.demo;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.HButil;

public class App 
{
    public static void main( String[] args )
    {
    	Session session =HButil.getFSessionFactory().openSession();
    	Transaction tx = session.beginTransaction();
    }
}
