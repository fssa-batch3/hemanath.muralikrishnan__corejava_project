package day09.practice;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TaskMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		initiliazing a arraylist to store the tasks
		ArrayList<Task> taskList = new ArrayList<>();

//		using try and catch to handle the unexpected beahvior

		try {

			System.out.println("Enter done to stop prompting");
			System.out.println("Enter the tas details like this -> (1, sample task, 2023-07-13)");

			while (true) {

//				getting the inputs from the user
				System.out.print("Enter input: ");
				String input = scanner.nextLine();

//				when the user type done the input prompt will end the print the hashmap
				if (input.equalsIgnoreCase("done")) {
					break;
				}

//				calling the method to validate the user input
				String[] arr = ValidateTask.validateInput(input);

				int taskId = Integer.parseInt(arr[0].trim());
				String taskName = arr[1].trim();
				String deadDate = arr[2].trim();

//				parsing the string has the local date

				DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate deadLineDate = LocalDate.parse(deadDate, dateFormatter);

//				adding the tasks to the task list array list
				taskList.add(new Task(taskId, taskName, deadLineDate));

			}

		} catch (IllegalArgumentException ex) {

//			catching the error message and printing it here
			System.out.println(ex.getMessage());
		}

//		sorting the tasklist using date and printing it
		Collections.sort(taskList);

		for (Task ele : taskList) {

			System.out.println(ele);
		}

		scanner.close();

	}
}
