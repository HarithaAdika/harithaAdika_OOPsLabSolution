package com.greatlearning.emailapplication.service;

import java.security.SecureRandom;
import java.util.Random;

import com.greatlearning.emailapplication.model.Employee;

public class CredentialService{
	static char[] SYMBOLS = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static char[] NUMBERS = "0123456789".toCharArray();
    static char[] ALL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    static int length=8;
    static Random rand = new SecureRandom();
	static String companyName=".abc.com";

	    public String generatePassword() {
	        assert length >= 4;
	        char[] password = new char[length];

	        password[0] = LOWERCASE[rand.nextInt(LOWERCASE.length)];
	        password[1] = UPPERCASE[rand.nextInt(UPPERCASE.length)];
	        password[2] = NUMBERS[rand.nextInt(NUMBERS.length)];
	        password[3] = SYMBOLS[rand.nextInt(SYMBOLS.length)];

	        for (int i = 4; i < length; i++) {
	            password[i] = ALL_CHARS[rand.nextInt(ALL_CHARS.length)];
	        }

	        for (int i = 0; i < password.length; i++) {
	            int randomPosition = rand.nextInt(password.length);
	            char temp = password[i];
	            password[i] = password[randomPosition];
	            password[randomPosition] = temp;
	        }
	        return new String(password);
	    }
	    	
	    public String generateEmailAddress(String FirstName, String LastName, String dept) {
	    	String emailAddress = FirstName+LastName+"@"+dept+companyName;
    		return emailAddress;
    		
	    }

		public void showCredentials(Employee emp, String generatedEmail, String generatedPassword) {
		
			String firstName = emp.getFirstName();
			System.out.println("Dear"+" "+firstName+" "+"your generated credentials are as follows");
			System.out.println("Email     --->"+generatedEmail);
			System.out.println("Password    --->"+generatedPassword);

	    }
	    
}
