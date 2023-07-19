package day09.practice;

import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDate;

public class TaskWithPriorityTest {

//	test with valid input
	@Test
	public void testValidadteString_ValidInput() {
		assertTrue(ValidateTaskWithPriority.validadteString("Valid input"));
	}

//    test with null input
	@Test(expected = IllegalArgumentException.class)
	public void testValidadteString_NullInput() {
		ValidateTaskWithPriority.validadteString(null);
	}

//    test with empty string
	@Test(expected = IllegalArgumentException.class)
	public void testValidadteString_EmptyInput() {
		ValidateTaskWithPriority.validadteString("");
	}

//    test task input with regex pattern

	@Test
	public void testValidateRegex_ValidInput() {
		assertTrue(ValidateTaskWithPriority.validateRegex("1, Sample task, 2023-07-13, 1",
				"^\\d+, [^,]+, \\d{4}-\\d{2}-\\d{2}, [1-5],?$"));
	}

//    test task with invalid input with regex pattern
	@Test(expected = IllegalArgumentException.class)
	public void testValidateRegex_InvalidInput() {
		ValidateTaskWithPriority.validateRegex("Invalid input", "^\\d+, [^,]+, \\d{4}-\\d{2}-\\d{2}, [1-5],?$");
	}

//    test the split with valid input
	@Test
	public void testValidateInput_ValidInput() {
		String[] result = ValidateTaskWithPriority.validateInput("1, Sample task, 2023-07-13, 1");
		assertArrayEquals(new String[] { "1", "Sample task", "2023-07-13", "1" }, result);
	}

//    test the task id with zero
	@Test(expected = IllegalArgumentException.class)
	public void testValidateInput_InvalidTaskId() {
		ValidateTaskWithPriority.validateInput("0, Sample task, 2023-07-13, 1");
	}

//    test the task with priority 6
	@Test(expected = IllegalArgumentException.class)
	public void testValidateInput_InvalidPriority() {
		ValidateTaskWithPriority.validateInput("1, Sample task, 2023-07-13, 6");
	}

}
