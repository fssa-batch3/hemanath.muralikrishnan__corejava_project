package day11.practice;

import java.util.*;

public class TaskMain {

	public static void main(String[] args) {

//		creating new task 
		Task task1 = new Task(1, "CPR Meeting", "Pending");
		Task task2 = new Task(2, "Face prep Metting", "Completed");
		Task task3 = new Task(3, "Hacker rank test", "Pending");

//		using try and catch to catch the DAOException from 

		try {

//			calling the create table query
//			TaskDAO.createTable();

//			calling the insert into method
			TaskDAO.createTask(task1);
			TaskDAO.createTask(task2);
			TaskDAO.createTask(task3);

		} catch (DAOException e) {

//			catching the DAO Exception the printing here
			System.out.println(e.getMessage());
		} finally {

			System.out.println("Process Completed");
		}
	}
}
