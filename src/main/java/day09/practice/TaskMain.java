package day09.practice;

import java.util.*;
import java.time.*;

public class TaskMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

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
				

			}

		} catch (InputMismatchException e) {

//			catching the error message and printing it here
			System.out.println(e.getMessage());

		} catch (IllegalArgumentException ex) {

//			catching the error message and printing it here
			System.out.println(ex.getMessage());
		}

//		creating five task using task blue print
		Task task1 = new Task(1, "CPR Metting", LocalDate.of(2023, 02, 13));
		Task task2 = new Task(2, "Face prep class", LocalDate.of(2023, 07, 11));
		Task task3 = new Task(3, "Hacker rank test", LocalDate.of(2023, 07, 17));
		Task task4 = new Task(4, "Holiday assignment", LocalDate.of(2023, 07, 15));
		Task task5 = new Task(5, "Hacker rank test", LocalDate.of(2023, 07, 05));

//		creating new array list to sort the task by comparing the date of task
		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);
		taskList.add(task5);

		Collections.sort(taskList);

		for (Task ele : taskList) {

			System.out.println(ele);
		}

		scanner.close();

	}
}
