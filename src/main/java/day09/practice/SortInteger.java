package day09.practice;

import java.util.*;
import day08.practice.*;

public class SortInteger {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		using try and catch to handle the unexpected behavior

		try {

//			prompting the input the from the user

			System.out.println("Enter -1 to stop the prompting");
			System.out.println("Enter the numbers with space separated (eg: 1 2 3 4 5):");

			String s = scanner.nextLine();
			ValidateSortNumbers.ValidadteString(s);
			ValidateSortNumbers.validateRegex(s, "\\d+(?: \\d+)*"); 

//			calling the method to sort the given integer
			ArrayList<Integer> arr = ValidateSortNumbers.sortNumbers(s.trim());

			System.out.println("Before sorting:");
			System.out.println(s);
			System.out.println("Aftering sorting:");
			for (int n : arr) {

				System.out.print(n + " ");
			}

		} catch (InputMismatchException e) {

//			if there is any input mistamatch exception that will catch here and printed
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException ex) {

			System.out.println(ex.getMessage());
		}

//		closing the scanner
		scanner.close();

	}
}
