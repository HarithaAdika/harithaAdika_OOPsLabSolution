package com.greatlearning.emailapplication.service;


import java.util.Scanner;

import com.greatlearning.emailapplication.model.Employee;
import com.greatlearning.emailapplication.service.CredentialService;

public class Driver {
	public static void main(String args[]) {
		
		Employee employee = new Employee("Harshit", "Chowdary");
		
		CredentialService cs = new CredentialService();
		String generatedPassword;
		String generatedEmailAddress;
		
		int option=0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Please enter the  department  from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		option =sc.nextInt();
		
		if(option >0 && option <=4) {
			
		switch(option){
		case 1:
			generatedPassword = cs.generatePassword();
			generatedEmailAddress = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
			cs.showCredentials(employee, generatedEmailAddress, generatedPassword);
			break;
		case 2:
			generatedPassword = cs.generatePassword();
			generatedEmailAddress = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"admin");
			cs.showCredentials(employee, generatedEmailAddress, generatedPassword);
			break;
			
		case 3:
			generatedPassword = cs.generatePassword();
			generatedEmailAddress = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"hr");
			cs.showCredentials(employee, generatedEmailAddress, generatedPassword);
			break;
		case 4:
			generatedPassword = cs.generatePassword();
			generatedEmailAddress = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"legal");
			cs.showCredentials(employee, generatedEmailAddress, generatedPassword);
			break;
			
		}
		}
		else{
			System.out.println("Invalid option choosen");
			
		}
		
		}while(option != 4);
		sc.close();
	}

}
