package day10.practice;

import java.util.regex.Pattern;

public class EmailValidator {

//	method which will validate the email if valid it return true other wise it will throw an exception
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {

//		checking the string is null or empty
		if (emailId == null || "".equals(emailId.trim())) {

//			throw new invalid email exception
			throw new InvalidEmailException("Email id cannot be null or empty");
		}

//		validate the given email id with regex pattern
		String str = emailId.trim();

		 String pattern = "^(?!.*\\.\\.)[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

		boolean isMatch = Pattern.matches(pattern, str);

//		if the input doesn't the match the regex pattern throw an exception
		if (!isMatch) {

			throw new InvalidEmailException("Email id doesn't match requested format");
		}

//		if there is no exception then return true

		return true;
	}

}