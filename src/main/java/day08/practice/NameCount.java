package day08.practice;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class NameCount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		using try and catch to handle unexpected behavior
		
		try {
			
//			getting the inputs from the user in the name with comma
			System.out.println("Enter the names in this format-> hemanath, joel, balaji, barath");
			System.out.println("Enter your name in the above format:");
			String s = scanner.nextLine();
			
//			calling the method to create a hashmap
			Map<String, Integer> countMap = ValidateNameCount.generateMap(s);
			
			System.out.println(countMap);
			
		} catch(IllegalArgumentException e) {
			
//			catching the thrown an error and printing it
			System.out.println(e.getMessage());
		}
		
		scanner.close();
		
	}
}
