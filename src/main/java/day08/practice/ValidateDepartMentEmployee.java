package day08.practice;

import java.util.regex.Pattern;

public class ValidateDepartMentEmployee {

//	method will validate the user input of the department name and employee name
	public static boolean ValidadteString(String s) throws IllegalArgumentException {

//		if the string is null or empty string error thrown
		if (s == null || "".equals(s.trim())) {

			throw new IllegalArgumentException("Input cannot be null or empty");
		}

//		otherwise there is no exception true return
		return true;
	}

//	method will validate the department name and employee name with regex pattern
	public static boolean validateRegex(String s, String pattern) throws IllegalArgumentException {

		boolean isMatch = Pattern.matches(pattern, s.trim());

//		if there given string doesn't matches the regex pattern throw error
		if (!isMatch) {

			throw new IllegalArgumentException("Inputs doesn't match the requested format");
		}

//		if there is no exception then return true
		return true;
	}

//	method will split the inputs return the array
	public static String[] splitInput(String s) throws IllegalArgumentException {

//		checking empty or null
		ValidadteString(s);
//		checking matching the regex pattern
		validateRegex(s.trim(), "^[A-Za-z]+,\\s*[A-Za-z]+\\s+[A-Za-z]+$");

		String[] str = s.split(",");

//		if the array list size is not equal to the two then throw an error
		if (str.length != 2) {

			throw new IllegalArgumentException(
					"Invalid input format. Please enter department name and employee name separated by a comma.");
		}

//		if there no exception then return the string array
		return str;
	}
}
