package com.practice.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.aopdemo.dao.AccountDAO;
import com.practice.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class) ;		
		
		// get the bean from spring container
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		// call the business method
		
		Account myAccount = new Account();
		
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();
		
		// call the accountDAO getter/setter methods
		theAccountDAO.setName("foobar");
		theAccountDAO.setServiceCode("silver");
		
		theAccountDAO.getName();
		theAccountDAO.getServiceCode();
		
		theMembershipDAO.addAccount();
		theMembershipDAO.goSleep();
		
		// close the context
		context.close();

	}

}
