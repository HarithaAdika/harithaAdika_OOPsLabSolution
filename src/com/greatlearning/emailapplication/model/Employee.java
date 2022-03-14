package com.greatlearning.emailapplication.model;

public class Employee {
	private String FirstName;
	private String LastName;

	public Employee(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

}
