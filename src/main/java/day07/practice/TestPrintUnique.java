package day07.practice;

import java.util.HashSet;
import java.util.ArrayList;

public class TestPrintUnique {

	public static void main(String[] args) {

//		creating new array list with duplicate values
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(3);

//		using try and catch to handle the unexpected behavior

		try {

//			calling the method to generate the hash set without duplicate method
//			if the array list is valid then the method will return the set without duplicate values

			HashSet<Integer> set = PrintUnique.generateSet(list);

			System.out.println("Before removing duplicate elements:");
			System.out.println(list);
			System.out.println("After removing duplicate elements:");
			System.out.println(set);

		} catch (IllegalArgumentException e) {

//			if there is any unexpected behavior the error will catch here and printed
			System.out.println(e.getMessage());
		} finally {

			System.out.println("Thank you!");
		}

	}
}
