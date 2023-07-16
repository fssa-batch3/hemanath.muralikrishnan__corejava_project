package day07.practice;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.ArrayList;

public class TestTask {

	public static void main(String[] args) {

//		creating new instance of the task object
		Task task1 = new Task(15, "CPR Metting", LocalDate.of(2023, 07, 15));
		Task task2 = new Task(16, "Faceprep Metting", LocalDate.of(2023, 07, 16));
		Task task3 = new Task(17, "Hacker rank test", LocalDate.of(2023, 07, 17));
		Task task4 = new Task(17, "Hacker rank test", LocalDate.of(2023, 07, 17));
		Task task5 = new Task(17, "Hacker rank test", LocalDate.of(2023, 07, 17));

//		declaring new array list with task blue print to add the tasks
		ArrayList<Task> TaskList = new ArrayList<>();
		TaskList.add(task1);
		TaskList.add(task2);
		TaskList.add(task3);
		TaskList.add(task4);
		TaskList.add(task5);
		
		
//		using try and catch handle the unexpected behavior
		try {
			
//			calling the method to create unique task set
			HashSet<Task> newTaskSet = RemoveDuplicatesTask.taskRemove(TaskList);
			
//			printing the unique task using for each
			
//			using for each printing the task objects
			for (Task ele : newTaskSet) {

				System.out.print("Task Id = " + ele.getId() + " , Task Name = " + ele.getName() + " , Task Deadline = "
						+ ele.getDeadline());
				System.out.println();
			}
			
		} catch(IllegalArgumentException e) {
			
//			if there is any error message throw that will catch there and printed
			System.out.println(e.getMessage());
		} finally {
			
			System.out.println("Thank you");
		}

	}
}
