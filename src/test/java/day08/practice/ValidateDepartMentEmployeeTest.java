package day08.practice;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateDepartMentEmployeeTest {

//	test with valid input
	@Test
	public void testValidadteString_ValidInput() {
		assertTrue(ValidateDepartMentEmployee.ValidadteString("ValidInput"));
	}

//	test with null input
	@Test(expected = IllegalArgumentException.class)
	public void testValidadteString_NullInput() {
		ValidateDepartMentEmployee.ValidadteString(null);
	}

//	test with empty string
	@Test(expected = IllegalArgumentException.class)
	public void testValidadteString_EmptyInput() {
		ValidateDepartMentEmployee.ValidadteString("");
	}

//	test with valid input
	@Test
	public void testValidateRegex_ValidInput() {
		assertTrue(ValidateDepartMentEmployee.validateRegex("Department, Employee E",
				"^[A-Za-z]+,\\s*[A-Za-z]+\\s+[A-Za-z]+$"));
	}

//	testing invalid input not having commma between two words

	@Test(expected = IllegalArgumentException.class)
	public void testValidateRegex_InvalidInput() {
		ValidateDepartMentEmployee.validateRegex("Invalid Input", "^[A-Za-z]+,\\s*[A-Za-z]+\\s+[A-Za-z]+$");
	}

//	test with valid inputs
	@Test
	public void testSplitInput_ValidInput() {
		String[] result = ValidateDepartMentEmployee.splitInput("HR, Hemanath M");
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals("HR", result[0].trim());
		assertEquals("Hemanath M", result[1].trim());
	}

//	test with null input
	@Test(expected = IllegalArgumentException.class)
	public void testSplitInput_NullInput() {
		ValidateDepartMentEmployee.splitInput(null);
	}

//	test with empty input
	@Test(expected = IllegalArgumentException.class)
	public void testSplitInput_EmptyInput() {
		ValidateDepartMentEmployee.splitInput("");
	}

//	test with invalid input 
	@Test(expected = IllegalArgumentException.class)
	public void testSplitInput_InvalidInput() {
		ValidateDepartMentEmployee.splitInput("Invalid Input");
	}
}
