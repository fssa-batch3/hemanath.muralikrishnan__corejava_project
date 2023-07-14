package day07.practice;

import java.util.HashSet;
import java.util.ArrayList;

public class PrintUnique {

//	method will generate the unique has set
	public static HashSet<Integer> generateSet(ArrayList<Integer> arr) throws IllegalArgumentException {

//		if the array list is null or size is zero throw an exceptoin]
		if (arr == null || arr.size() == 0) {

			throw new IllegalArgumentException("Array list cannot be null or empty");
		}

//		if the array list is not null
//		then generate the set without duplicate

		HashSet<Integer> set = new HashSet<>(arr);

//		and return the set 
		return set;

	}
}
