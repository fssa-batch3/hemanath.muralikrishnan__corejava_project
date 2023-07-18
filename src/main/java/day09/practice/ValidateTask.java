package day09.practice;

import java.util.regex.Pattern;

public class ValidateTask {

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

//	method which will receive the user input and split the user inputs

	public static String[] validateInput(String s) throws IllegalArgumentException {

//		validate the user inputs is given in the requested format using regex

		validadteString(s);
		validateRegex(s, "^(\\d+),\\s*(.*?),\\s*(\\d{4}-\\d{2}-\\d{2})$");

		String[] arr = s.split(",");

		int taskId = Integer.parseInt(arr[0]);

		if (taskId <= 0) {

			throw new IllegalArgumentException("Task id cannot be zero or lesser than zero");
		}

		return arr;
	}
}
