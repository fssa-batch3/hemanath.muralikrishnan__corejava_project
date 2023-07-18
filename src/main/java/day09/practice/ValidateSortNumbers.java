package day09.practice;

import java.util.*;
import java.util.regex.Pattern;

public class ValidateSortNumbers {

//	method will validate the user input 
	public static boolean ValidadteString(String s) throws IllegalArgumentException {

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

//		if there is no exception then returnt true
		return true;
	}

//	method will return the sorted numbers
	public static ArrayList<Integer> sortNumbers(String s) throws IllegalArgumentException {

//		split the given string using spaces
		String[] str = s.split(" ");

//		create new arraylist of integer to store the input number
		ArrayList<Integer> arr = new ArrayList<>();

		for (String n : str) {

//			converting string into int and adding to the arraylist
			int x = Integer.parseInt(n);

			arr.add(x);
		}

		Collections.sort(arr);

		return arr;
	}

}
