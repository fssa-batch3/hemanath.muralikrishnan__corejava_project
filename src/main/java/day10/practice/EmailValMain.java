package day10.practice;

import java.util.*;

public class EmailValMain {

	public static void main(String[] args) {
		
//		using scanner to get input from the user
		
		Scanner scanner = new Scanner(System.in);
		
//		writing using try and catch because email validator can InvalidEmailException
		
		try {
			
//			get the input from the user
			System.out.println("Enter your email id to validate:");
			String emailId = scanner.nextLine();
			
//			calling the emailvalidator method to validate the given email id
			boolean isValid = EmailValidator.isValidEmail(emailId);
			
			if(isValid) {
				
				System.out.println("Given email id " + emailId.trim() +" is valid");
			} else {
				
				System.out.println("Given email id " + emailId.trim() +" is Invalid");
			}
			
		} catch(InvalidEmailException e) {
			
//			catching the throwed Invalid email exception and printing the message here
			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}
}
