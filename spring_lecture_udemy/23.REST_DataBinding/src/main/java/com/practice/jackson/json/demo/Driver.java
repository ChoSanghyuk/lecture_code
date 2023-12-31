package com.practice.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read Json file and map to Java POJO
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// print first name and last name
			System.out.println("First Name : " + theStudent.getFirstName());
			System.out.println("Last Name : " + theStudent.getLastName());
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
