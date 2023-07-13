package day06.practice;

import java.util.regex.Pattern;

public class AddTaskValidator {

//	validate the string is not equal to null or empty
	public static boolean ValidateTaskName(String name) throws IllegalArgumentException {

//		if the string null or empty throw an exception
		if (name == null || "".equals(name.trim())) {

			throw new IllegalArgumentException("Taskname cannot be null or empty");
		}

//		task name must contains alphabets
		String pattern = "^[a-zA-Z ]{1,50}$"; 

		Boolean isMatch = Pattern.matches(pattern, name);

		// if isMatch holds false value throw new error
		if (Boolean.FALSE.equals(isMatch)) {
			throw new IllegalArgumentException("Invalid task name. Given input doesn't match the requested format.");
		}

//		if there is no exception then return true
		return true;
	}
	
//	validate the priority 
	public static boolean ValidatePriority(int num) throws IllegalArgumentException {
		
//		if the priority is lesser than or equal to zero or greater than five throw exception
		
		if(num <= 0 || num > 5) {
			
			throw new IllegalArgumentException("Task priority must be within the 1 to 5");
		}
		
//		if there is no exception then return true
		return true;
	}
}
