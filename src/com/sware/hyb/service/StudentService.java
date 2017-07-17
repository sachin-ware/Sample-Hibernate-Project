package com.sware.hyb.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sware.hyb.App;
import com.sware.hyb.domain.Student;

public class StudentService     {
	
	public static Session session=App.getSession();
	public static Transaction transaction;//=App.getTransaction();

	public static  boolean saveStudent(Student student){
		try {
			transaction=session.beginTransaction();
			session.save(student);
			transaction.commit();
			//session.close();
		} catch (Exception e) {
			System.out.println("Exception while saving student:"+e.getMessage());
			return false;
		}
		return true;
	}
	
	
	public static  List<Student> getAllStudents(){
		
		List<Student> sList=null;
		try {
			//transaction=session.beginTransaction();
			Query<Student> query= session.createQuery("from Student");// This is HQL used to fetch all records from database table.
			sList=query.getResultList();
			//transaction.commit();
			//session.close();
		} catch (Exception e) {
			System.out.println("Exception while saving student:"+e.getMessage());
			//return sList;
		}
		return sList;
	}

}
