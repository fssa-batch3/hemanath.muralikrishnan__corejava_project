package day09.practice;

import java.util.regex.Pattern;

public class ValidateTaskWithPriority {

//	method will validate the user input 
	public static boolean validadteString(String s) throws IllegalArgumentException {

//		if the string is null or empty string error thrown
		if (s == null || "".equals(s.trim())) {

			throw new IllegalArgumentException("Input cannot be null or empty");
		}

//		otherwise there is no exception true return
		return true;
	}

//	method will validate the input using regex pattern
	public static boolean validateRegex(String s, String pattern) throws IllegalArgumentException {

		boolean isMatch = Pattern.matches(pattern, s.trim());

//		if there given string doesn't matches the regex pattern throw error
		if (!isMatch) {

			throw new IllegalArgumentException("Inputs doesn't match the requested format");
		}

//		if there is no exception then return true
		return true;
	}

//	method will receive the user input and split into the and return the array of string

	public static String[] validateInput(String s) throws IllegalArgumentException {

		validadteString(s);
		validateRegex(s, "^\\d+, [^,]+, \\d{4}-\\d{2}-\\d{2}, [1-5],?$");

		String[] arr = s.split(",");

		int taskId = Integer.parseInt(arr[0].trim());
		int priority = Integer.parseInt(arr[3].trim());

//		check if the task id less than 0 or eqaul to 0 throw an erro
		if (taskId <= 0) {

			throw new IllegalArgumentException("Task id cannot be zero or lesser than zero");
		}

//		check if the priority is lesser than 0 or eqaul to zero and greather than 5 throw an error

		if (priority <= 0 || priority > 5) {

			throw new IllegalArgumentException("Task priority must be between 1 to 5");
		}

		return arr;

	}
}
