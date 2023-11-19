package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		// use the session object to save Java object
		try {
			// create 3 student objects
			System.out.println("Creating new student object");
			Student tempStudent1 = new Student("Sin", "Woosuck", "koyang@naver.com");
			Student tempStudent2 = new Student("Cho", "Sanghyuk", "kyoha@naver.com");
			Student tempStudent3 = new Student("Yoo", "Siyoung", "hwagok@naver.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("Saving the student");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);

			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");

		} finally {
			factory.close();
		}

	}

}
