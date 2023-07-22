package day12.practice;

import day11.practice.DAOException;
import day11.practice.Task;
import java.util.*;

public class TaskMain {

	public static void main(String[] args) {

		Task task = new Task(5, "Holiday assignment", "Pending");

		try {

//			create task
//			TaskCRUD.createTask(task);

//			update task
//			TaskCRUD.updateTask(3);

//			delete task
//			TaskCRUD.deleteTask(5);

//			retrive all the task an print
			List<Task> tasksList = TaskCRUD.getAllTasks();

			for (Task ele : tasksList) {

				System.out.println(ele);
			}

		} catch (DAOException e) {

			System.out.println(e.getMessage());

		} finally {

			System.out.println("Process Completed");
		}
	}
}
