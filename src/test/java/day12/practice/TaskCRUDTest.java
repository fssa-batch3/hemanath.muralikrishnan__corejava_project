package day12.practice;

import static org.junit.Assert.*;
import org.junit.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import day11.practice.DAOException;
import day11.practice.Task;
import java.util.*;

public class TaskCRUDTest {

	@Test
	public void testCreateTask_ValidTask() {
		Task task = new Task(7, "Holiday", "Pending");

		try {
			// Call the createTask() method to insert the task into the database.
			TaskCRUD.createTask(task);

			// Retrieve the inserted task from the database.
			List<Task> tasksList = TaskCRUD.getAllTasks();

			// Find the task with task_id = 5 (assuming that task_id is unique).
			Task retrievedTask = null;
			for (Task t : tasksList) {
				if (t.getId() == task.getId()) {
					retrievedTask = t;
					break;
				}
			}

			// Check if the retrieved task is not null (i.e., found in the database).
			assertNotNull("Task was not inserted into the database", retrievedTask);

			// Compare the attributes of the original task with the retrieved task.
			assertEquals(task.getName(), retrievedTask.getName());
			assertEquals(task.getStatus(), retrievedTask.getStatus());

		} catch (DAOException e) {
			e.printStackTrace();
			fail("Unexpected exception occurred: " + e.getMessage());
		}
	}

	@Test(expected = DAOException.class)
	public void testCreateTask_NullTask() {
		// Invalid test case for createTask()
		// Try to insert a null Task into the database and expect a DAOException to be
		// thrown.

		// Set up the test environment with a null task.
		Task nullTask = null;

		// Call the createTask() method with the null task.
		TaskCRUD.createTask(nullTask);

		// The above line should throw a DAOException due to the null task.
		// If it doesn't, the test case will fail.

	}

	@Test
	public void testUpdateTask_ValidTaskId() {
		// Valid test case for updateTask()
		// Insert a test task into the database, then update its status and check if it
		// was updated correctly.
	}

	@Test(expected = DAOException.class)
	public void testUpdateTask_InvalidTaskId() {
		// Invalid test case for updateTask()
		// Try to update a task with an invalid (non-existing) task_id and expect a
		// DAOException to be thrown.
	}

	@Test
	public void testDeleteTask_ValidTaskId() {
		// Valid test case for deleteTask()
		// Insert a test task into the database, then delete it and check if it was
		// deleted correctly.
	}

	@Test(expected = DAOException.class)
	public void testDeleteTask_InvalidTaskId() {
		// Invalid test case for deleteTask()
		// Try to delete a task with an invalid (non-existing) task_id and expect a
		// DAOException to be thrown.
	}

	@Test
	public void testGetAllTasks() {
		// Test the getAllTasks() method.
		// Insert some test tasks into the database, and then call getAllTasks().
		// Compare the returned List<Task> with your test data to check if it's
		// accurate.
	}
}
