package day06.practice;
import java.util.ArrayList;

public class TestFindTask {
	

	public static void main(String[] args) {
		
//		creating new array list with blue print of task details
		ArrayList<TaskDetails> tasks = new ArrayList<>();
		
//		add the tasks to the task array list
		tasks.add(new TaskDetails("Morning BreakFast", 1));
		tasks.add(new TaskDetails("Afternoon Launch", 3));
		tasks.add(new TaskDetails("CPR Meeting", 4));
		
//		using try and catch to handle unexpected behavior
		
		 try {
			 
//			 calling the method to find the task is available or not
			 boolean isFind = FindTask.SearchEle(tasks, "Afternoon");
			 
//			 if the task is available below statement is printed
			 if(isFind) {
				 
				 System.out.println("Task found");
			 } else {
				
//				 if the task is not found below statement is printed.
				 System.out.println("Task not found");
			 }
			 
			 
//			 if there is any expected thrown that will catch here and printed
		 } catch(IllegalArgumentException e) {
			 
			 System.out.println(e.getMessage());
		 }
	}
}
