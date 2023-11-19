package com.practice.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass() + ": Adding a memebership account");
	}
	
	public boolean addsomething() {
		System.out.println(getClass() + ": Adding a sth");
		
		return true;
	}
	
	public void goSleep() {
		
		System.out.println(getClass() + ": I'm going to sleep now...");
	}
}
