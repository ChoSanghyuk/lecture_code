package com.practice.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.practice.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;

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
