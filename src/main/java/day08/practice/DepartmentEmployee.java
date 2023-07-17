package day08.practice;

import java.util.*;

public class DepartmentEmployee {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		notify the user about the input format and how to end the input
		System.out.println("Enter department names and employee names (comma-separated).");
		System.out.println("Enter 'done' to finish input.");

//		using while loop to get input from the user until the user type done and end the inputs prompt
//		initiliazing new hash map with key has string and values as list
		HashMap<String, List<String>> departmentMap = new HashMap<>();

		try {

			while (true) {

//				getting the inputs from the user
				System.out.print("Enter input: ");
				String input = scanner.nextLine();

//				when the user type done the input prompt will end the print the hashmpa
				if (input.equalsIgnoreCase("done")) {
					break;
				}

//				calling the method to validate the string and split it using comma
				String[] arr = ValidateDepartMentEmployee.splitInput(input);

				String departmentName = arr[0].trim();
				String employeeName = arr[1].trim();

//				validate the nullity of the both string
				ValidateDepartMentEmployee.ValidadteString(departmentName);
				ValidateDepartMentEmployee.ValidadteString(employeeName);

//				validate the string with regex pattern
				ValidateDepartMentEmployee.validateRegex(departmentName, "^[a-zA-Z ]+$");
				ValidateDepartMentEmployee.validateRegex(employeeName, "^[a-zA-Z ]+$");

//				if the dept map doesn't contains the dept name then add the dept name with empty array list
				if (!departmentMap.containsKey(departmentName)) {

					departmentMap.put(departmentName, new ArrayList<String>());
				}
//				each time in the dept map using the dept name the employee name will be added

				departmentMap.get(departmentName).add(employeeName);

//				if there is no exception then return the department map

			}

		} catch (IllegalArgumentException e) {

//			if there is any error throw 
			System.out.println(e.getMessage());
		}

		System.out.println("\nDepartment names and list of employees:");

//		printing the each department employee name with depart name
		for (String departmentName : departmentMap.keySet()) {

			System.out.println(departmentName + ": " + departmentMap.get(departmentName));
		}

		scanner.close();
	}
}
