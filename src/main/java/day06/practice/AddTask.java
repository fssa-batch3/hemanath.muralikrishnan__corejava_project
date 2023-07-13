package day06.practice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddTask {

	public static void main(String[] args) {

		// creating new array list using the blue print of the task details
		ArrayList<TaskDetails> taskList = new ArrayList<>();

		// create a scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		try {

			// prompt the user to enter the task name
			System.out.println("Enter the task name: ");
			String taskName = scanner.nextLine();

			// prompt the user to enter the task priority
			System.out.println("Enter the task priority: ");
			int priority = scanner.nextInt();

			// create a new task object and add it to the array list
			TaskDetails task = new TaskDetails(taskName, priority);
			taskList.add(task);

			// print the task details
			for (TaskDetails taskDetails : taskList) {
				System.out.println(taskDetails.taskName + " - " + taskDetails.priority);
			}

		} catch (InputMismatchException e) {
			
			System.out.println(e.getMessage());

		} catch (IllegalArgumentException ex) {
			
			System.out.println(ex.getMessage());
		} finally {
			
			System.out.println("Thank you!");
		}

	}
}
