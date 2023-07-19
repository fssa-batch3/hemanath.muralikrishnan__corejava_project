package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

//	method to remove duplicates from the method
	public static List<String> removeDuplicates(List<String> cityList) throws IllegalArgumentException {

//		if the array list 
		if (cityList == null || cityList.size() == 0) {

			throw new IllegalArgumentException("City list cannot be null or empty");
		}
 
//		creating new array list to store the unique city names 

		List<String> newList = new ArrayList<String>();
 
		for (String element : cityList) {

			if (!newList.contains(element)) {

				newList.add(element);
			}
		}

//		if there is no duplicates elements in the array throw new error

		if (newList.size() == cityList.size()) {

			throw new IllegalArgumentException("No duplicates found");
		}

		return newList;

	}

	
}