package day06.practice;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class FindTaskTest {

//	testing the find task with valid inputs
	@Test
	public void testFindTaskWithValidInputs() {

//		creating new array list with blue print of task details
		ArrayList<TaskDetails> tasks = new ArrayList<>();

//		add the tasks to the task array list
		tasks.add(new TaskDetails("Morning BreakFast", 1));
		tasks.add(new TaskDetails("Afternoon Launch", 3));
		tasks.add(new TaskDetails("CPR Meeting", 4));

		assertTrue(FindTask.SearchEle(tasks, "Afternoon Launch"));
	}

//	testing the find task with null array list
	@Test(expected = IllegalArgumentException.class)
	public void testFindTaskWithNullList() throws Exception {

//		creating new array list with blue print of task details
		ArrayList<TaskDetails> tasks = null;
		FindTask.SearchEle(tasks, "Afternoon Launch");
	}

//	testing the find task with empty array list
	@Test(expected = IllegalArgumentException.class)
	public void testFindTaskWithEmptyList() throws Exception {

//		creating new array list with blue print of task details
		ArrayList<TaskDetails> tasks = new ArrayList<>();
		FindTask.SearchEle(tasks, "Afternoon Launch");
	}

//	testing the find task with null find task name
	@Test(expected = IllegalArgumentException.class)
	public void testFindTastNameWithNull() throws Exception {
 
//		creating new array list with blue print of task details
		ArrayList<TaskDetails> tasks = new ArrayList<>();

//		add the tasks to the task array list
		tasks.add(new TaskDetails("Morning BreakFast", 1));
		tasks.add(new TaskDetails("Afternoon Launch", 3));
		tasks.add(new TaskDetails("CPR Meeting", 4));

		FindTask.SearchEle(tasks, null);

	}

//	testing the find task with empty find task name
	@Test(expected = IllegalArgumentException.class)
	public void testFindTastNameWithEmpty() throws Exception {

//		creating new array list with blue print of task details
		ArrayList<TaskDetails> tasks = new ArrayList<>();

//		add the tasks to the task array list
		tasks.add(new TaskDetails("Morning BreakFast", 1));
		tasks.add(new TaskDetails("Afternoon Launch", 3));
		tasks.add(new TaskDetails("CPR Meeting", 4));

		FindTask.SearchEle(tasks, "    ");

	}
	
//	testing the find task with Invalid find task name
	@Test(expected = IllegalArgumentException.class)
	public void testFindTastNameWithInvalidName() throws Exception {

//		creating new array list with blue print of task details
		ArrayList<TaskDetails> tasks = new ArrayList<>();

//		add the tasks to the task array list
		tasks.add(new TaskDetails("Morning BreakFast", 1));
		tasks.add(new TaskDetails("Afternoon Launch", 3));
		tasks.add(new TaskDetails("CPR Meeting", 4));

		FindTask.SearchEle(tasks, "@TaskName12345");

	}

}
