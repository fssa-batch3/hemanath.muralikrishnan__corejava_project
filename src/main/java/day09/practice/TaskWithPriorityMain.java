package day09.practice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TaskWithPriorityMain {

	public static void main(String[] args) {

//		creating scanner object to get input from the user
		Scanner scanner = new Scanner(System.in);

//		creating new arraylist to store the task list
		List<TaskWithPriority> taskList = new ArrayList<>();

//		using try and catch to handle the unexpected beahvior

		try {

			System.out.println("Enter done to stop the prompting");
			System.out.println("Enter your task in this format -> 1, Sample task, 2023-07-13, 1to5");

			while (true) {

//				getting the inputs from the user
				System.out.print("Enter input: ");
				String input = scanner.nextLine();

//				when the user type done the input prompt will end the print the hashmap
				if (input.equalsIgnoreCase("done")) {
					break;
				}

//				calling the method validate the input and split
				String[] arr = ValidateTaskWithPriority.validateInput(input);

				int taskId = Integer.parseInt(arr[0].trim());
				String taskName = arr[1].trim();
				String deadDate = arr[2].trim();
				int taskPrio = Integer.parseInt(arr[3].trim());

				DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate deadLineDate = LocalDate.parse(deadDate, dateFormatter);

				taskList.add(new TaskWithPriority(taskId, taskName, deadLineDate, taskPrio));

			}

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());
		}

//		sorting the task list object using override comparator
		Collections.sort(taskList, new DateComparWithPrior());

//		printing the each object after sorting
		for (TaskWithPriority ele : taskList) {

			System.out.println(ele);
		}

		scanner.close();
	}
}
