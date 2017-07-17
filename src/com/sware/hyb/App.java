package com.sware.hyb;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.sware.hyb.domain.Student;
import com.sware.hyb.ui.MainPage;

public class App {
	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	private static Session session;
	private static Transaction transaction;
	
	
	public App() {
		System.out.println("App Constructor called");
		configuration=new Configuration().configure();
		 sessionFactory=configuration.buildSessionFactory();
		 session=sessionFactory.openSession();
		 //transaction=session.beginTransaction();
	}
	
	
	
	
	public static void main(String[] args) {
		
		//Lecture l=new Lecture(4,"JEE-Java",102);
		App app=new App();
		
		MainPage mainPage=new MainPage();
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public  static  Session getSession() {
		return session;
	}

	public  static void setSession(Session session) {
		session = session;
	}

	public static Transaction getTransaction() {
		return transaction;
	}
	
	public  static void setTransaction(Transaction transaction) {
		transaction = transaction;
	}

}
