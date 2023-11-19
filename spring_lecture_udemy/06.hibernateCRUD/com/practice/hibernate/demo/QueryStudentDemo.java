package com.practice.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		System.out.println("started");
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		// use the session object to save Java object
		try {
					
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display the students
			displayStudents(theStudents);
			
			// query students: lastName = "YoungJae"
			theStudents = session.createQuery("from Student s where s.lastName='YoungJae'").getResultList();
			displayStudents(theStudents);
			
			// query students ; lastName= "YoungJae" OR firstName = "Sin"
			theStudents = session.createQuery("from Student s where s.lastName='YoungJae' OR s.firstName = 'Sin'").getResultList();
			displayStudents(theStudents);
			
			// query students where email Like '@naver.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%naver.com'").getResultList();
			displayStudents(theStudents);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
