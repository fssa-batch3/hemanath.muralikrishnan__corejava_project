package day07.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import org.junit.Test;

public class TestDay07RemoveDuplicatesTask {

//	test with valid input
	@Test
	public void testWithValidInputs() {

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

//		expected hashset from the method
		HashSet<Task> expectedSet = new HashSet<>();
		expectedSet.add(task1);
		expectedSet.add(task2);
		expectedSet.add(task3);

//		calling the method to test the remove duplicates method
//		calling the method to create unique task set
		HashSet<Task> actualSet = RemoveDuplicatesTask.taskRemove(TaskList);

//		checking the expected and actual set are equal
		assertIterableEquals(expectedSet, actualSet);

	}

//	test the array list null input
	@Test(expected = IllegalArgumentException.class)
	public void testWithNullInput() throws Exception {

//		declaring new array list with null
		ArrayList<Task> TaskList = null;

		HashSet<Task> actualSet = RemoveDuplicatesTask.taskRemove(TaskList);

	}

//	test the task list size with zero
	@Test(expected = IllegalArgumentException.class)
	public void testWithSizeZero() throws Exception {

//		declaring new array list with size zero
		ArrayList<Task> TaskList = new ArrayList<>();

		HashSet<Task> actualSet = RemoveDuplicatesTask.taskRemove(TaskList);
	}

//	test the task list without duplicates
	@Test(expected = IllegalArgumentException.class)
	public void testWithoutDuplicates() throws Exception {

//		creating new instance of the task object
		Task task1 = new Task(15, "CPR Metting", LocalDate.of(2023, 07, 15));
		Task task2 = new Task(16, "Faceprep Metting", LocalDate.of(2023, 07, 16));
		Task task3 = new Task(17, "Hacker rank test", LocalDate.of(2023, 07, 17));

//		declaring new array list with task blue print to add the tasks
		ArrayList<Task> TaskList = new ArrayList<>();
		TaskList.add(task1);
		TaskList.add(task2);
		TaskList.add(task3);

//		calling the method to test the remove duplicates method
//		calling the method to create unique task set
		HashSet<Task> actualSet = RemoveDuplicatesTask.taskRemove(TaskList);

	}

}
