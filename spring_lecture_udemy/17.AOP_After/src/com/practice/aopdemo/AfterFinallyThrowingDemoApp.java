package com.practice.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.aopdemo.dao.AccountDAO;

public class AfterFinallyThrowingDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class) ;		
		
		// get the bean from spring container
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call the method to find the accounts
		List<Account> theAccounts = null;
		
		try {
			// add a boolean flag to simualte exceptions
			boolean tripWire = false;
			theAccounts = theAccountDAO.findAccounts(tripWire);
		}catch(Exception exc) {
			System.out.println("\nIn main program : catch " + exc);
		}
		
		// display the accounts
		System.out.println("\nIn main program : "+theAccounts);
		
		
		// close the context
		context.close();

	}

}
