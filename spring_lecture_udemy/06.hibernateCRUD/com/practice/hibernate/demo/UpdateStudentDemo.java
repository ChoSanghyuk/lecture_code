package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

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
			int studentId = 1;

			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id : primary key
			Student myStudent = session.get(Student.class, studentId );
			
			// Update single object
			System.out.println("Updating student...");
			myStudent.setFirstName("Genius");
			
			session.getTransaction().commit();
			
			// Update multiple objects
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// update email for all students
			session.createQuery("update Student set email='genius@gmail.com'").executeUpdate();
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
		} finally {
			factory.close();
		}
		
		
		

	}

}
