package day11.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCreateTask {

//	with valid inputs
	@Test
	public void testWithValidInput() {

		Task task = new Task(4, "Sample Task", "Completed");
		assertDoesNotThrow(() -> TaskDAO.createTask(task));
	}

//	with invalid input
	@Test
	public void testWithInvalidInput() {

		Task task = null;
		assertThrows(DAOException.class, () -> TaskDAO.createTask(task));
	}
}
