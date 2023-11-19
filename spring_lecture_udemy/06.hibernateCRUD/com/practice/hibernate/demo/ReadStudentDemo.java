package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		// use the session object to save Java object
		try {
			// create a student object
			System.out.println("Creating new student object");
			Student tempStudent = new Student("Hong", "YoungJae", "yadang@naver.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student");
			session.save(tempStudent);
			
			// commit transaction
			session.getTransaction().commit();
			
			// find out the student's id: primary key
			System.out.println("Generated id" + tempStudent.getId() );
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id : primary key
			Student myStudent = session.get(Student.class, tempStudent.getId() );
			System.out.println("Get complete: " + myStudent);
			
			session.getTransaction().commit();
			System.out.println("Done");
			
		} finally {
			factory.close();
		}
		
		
		

	}

}
