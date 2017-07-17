package com.sware.hyb;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Configuration conf=new Configuration().configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Lecture l=new Lecture(4,"JEE-Java",102);
		session.save(l);
		
		t.commit();
	}

}
