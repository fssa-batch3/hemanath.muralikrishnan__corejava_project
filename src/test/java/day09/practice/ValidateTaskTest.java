package day09.practice;

import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;

public class ValidateTaskTest {

//	test with valid input
	@Test
	public void testValidadteString_ValidInput() {
		assertTrue(ValidateTask.validadteString("1, Sample Task, 2023-07-13"));
	}

//   test with null input
	@Test(expected = IllegalArgumentException.class)
	public void testValidadteString_NullInput() {
		ValidateTask.validadteString(null);
	}
 
//    test will empty input
	@Test(expected = IllegalArgumentException.class)
	public void testValidadteString_EmptyInput() {
		ValidateTask.validadteString("");
	}

//    test the input with regex pattern
	@Test
	public void testValidateRegex_ValidInput() {
		assertTrue(ValidateTask.validateRegex("1, Sample Task, 2023-07-13",
				"^(\\d+),\\s*(.*?),\\s*(\\d{4}-\\d{2}-\\d{2})$"));
	}

//    test the date as wrong with regex pattern
	@Test(expected = IllegalArgumentException.class)
	public void testValidateRegex_InvalidInput() {
		ValidateTask.validateRegex("1, Sample Task, 2023-07", "^(\\d+),\\s*(.*?),\\s*(\\d{4}-\\d{2}-\\d{2})$");
	}

//    test the split with valid input
	@Test
	public void testValidateInput_ValidInput() {
		String[] expected = { "1", "Sample Task", "2023-07-13" };
		String[] result = ValidateTask.validateInput("1, Sample Task, 2023-07-13");
		assertArrayEquals(expected, result);
	}

//    test the task id with zero
	@Test(expected = IllegalArgumentException.class)
	public void testValidateInput_InvalidTaskId() {
		ValidateTask.validateInput("0, Sample Task, 2023-07-13");
	}

//    test the date with invalid input 
	@Test(expected = IllegalArgumentException.class)
	public void testValidateInput_InvalidDateFormat() {
		ValidateTask.validateInput("1, Sample Task, 2023/07/13");
	}
}
