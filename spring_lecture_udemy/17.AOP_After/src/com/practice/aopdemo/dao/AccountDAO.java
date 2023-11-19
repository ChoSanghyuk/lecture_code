package com.practice.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.practice.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	// add a new method 
	
	public List<Account> findAccounts(boolean tripWire){
		
		// for academic purpose.. simulte an exception
		
		if(tripWire) {
			throw new RuntimeException("Time is running out");
		}
		List<Account> myAccounts = new ArrayList<>();
		
		// create sample accounts
		Account temp1 = new Account("Jon", "Silver");
		Account temp2 = new Account("Hong", "Bronze");
		Account temp3 = new Account("Park", "Gold");
		
		// add them to our accounts list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		return myAccounts;
	}

	public void addAccount(Account theAccount, boolean bool) {
		System.out.println(getClass() + ": Doing My DB Work: Adding an account");
	}
	
	public void doWork() {
		System.out.println(getClass() + ": Doing Some Work");
	}

	public String getName() {
		System.out.println(getClass() + ": Doing getName");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": Doing setName");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": Doing getServiceCode");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": Doing setServiceCode");
		this.serviceCode = serviceCode;
	}
	
}
