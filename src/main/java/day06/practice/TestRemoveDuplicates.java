package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveDuplicates {

public static void main(String[] args) {
		
//		creating new array list

		List<String> cityList = new ArrayList<>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		try {

//			calling the method to remove the duplicates from the array list
			List<String> newList = RemoveDuplicates.removeDuplicates(cityList);

			System.out.println(newList);

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());
		}
 
	}
}
