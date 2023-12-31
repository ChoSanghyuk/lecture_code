package com.practice.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.aopdemo.dao.AccountDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class) ;		
		
		// get the bean from spring container
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call the method to find the accounts
		List<Account> theAccounts = theAccountDAO.findAccounts();
		
		// display the accounts
		System.out.println("\nIn main program : "+theAccounts);
		
		
		// close the context
		context.close();

	}

}
