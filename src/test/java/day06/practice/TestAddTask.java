package day06.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddTask {

//	testing the validate name with valid input
	@Test
	public void testValidateTaskNameWithValidInput() {
		assertTrue(AddTaskValidator.ValidateTaskName("CPR Meeting"));
	}

//	testing the validate name with empty string

	@Test(expected = IllegalArgumentException.class)
	public void testValidateTaskNameWithEmptyInput() throws Exception {
		AddTaskValidator.ValidateTaskName("         ");
	}

//	testing the validate name with null input

	@Test(expected = IllegalArgumentException.class)
	public void testValidateTaskNameWithNullInput() {
		AddTaskValidator.ValidateTaskName(null);
	}

//	testing the validate name with invalid input format

	@Test(expected = IllegalArgumentException.class)
	public void testValidateTaskNameWithInvalidInput() throws Exception {

		AddTaskValidator.ValidateTaskName("Invalid Task Name123@#$%^&*()");

	}

//	testing the validate priority with valid input
	@Test
	public void testValidatePriorityWithValidInput() {

		assertTrue(AddTaskValidator.ValidatePriority(1));
	}

//	testing the validate priority with lesser than zero 
	
	@Test(expected = IllegalArgumentException.class)
	public void testValidatePriorityWithInvalidInput() throws Exception {
		AddTaskValidator.ValidatePriority(-1);
	}

//	testing the validate priority with greater than five
	@Test(expected = IllegalArgumentException.class)
	public void testValidatePriorityWithOutOfRangeInput() throws Exception {
		AddTaskValidator.ValidatePriority(7);
	}
}
