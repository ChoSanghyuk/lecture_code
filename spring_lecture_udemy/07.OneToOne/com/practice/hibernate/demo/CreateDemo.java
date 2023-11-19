package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Instructor;
import com.practice.hibernate.demo.entity.InstructorDetail;
import com.practice.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		System.out.println("started");
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		// use the session object to save Java object
		try {
			// create a student object
			
			System.out.println("Creating new  object");
			Instructor tempInstructor = new Instructor("Hong", "Youngjae", "yadang@naver.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("www.yadang.com/youtube", "pingpong");
			
			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			// start a transaction
			session.beginTransaction();
			
			// save the instructor object + also save detail object
			System.out.println("Saving the Instructor");
			session.save(tempInstructor); 
			
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		} finally {
			factory.close();
		}
		
		
		

	}

}
