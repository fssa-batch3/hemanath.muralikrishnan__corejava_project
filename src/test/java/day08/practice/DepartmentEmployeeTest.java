package day08.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DepartmentEmployeeTest {

//	
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setOutput() {
		System.setOut(new PrintStream(output));
	}

	@Test
	public void testDepartmentEmployeeMain() {
		// Test with valid input and check output
		String input = "HR, John Doe\n" + "Engineering, Jane Smith\n" + "HR, Alice Johnson\n" + "done\n";
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);

		DepartmentEmployee.main(new String[] {});

		String expectedOutput = "Enter department names and employee names (comma-separated).\n"
				+ "Enter 'done' to finish input.\n" + "Enter input: Enter input: Enter input: Enter input: \n"
				+ "Department names and list of employees:\n" + "Engineering: Jane Smith \n"
				+ "HR: Alice Johnson John Doe \n";

		// Normalize line endings and remove extra whitespace
		String normalizedExpected = normalizeString(expectedOutput);
		String normalizedActual = normalizeString(output.toString());

		assertEquals(normalizedExpected, normalizedActual);
	}

	private String normalizeString(String str) {
		return str.replaceAll("\\r\\n", "\n").trim();
	}

	@Test
	public void testDepartmentEmployeeMain_InvalidInput() {
		// Test with invalid input format and check if the error message is thrown
		String input = "HR, John Doe\n" + "Invalid Input\n" + "done\n";
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);

		assertThrows(IllegalArgumentException.class, () -> DepartmentEmployee.main(new String[] {}));
	}

	@Test
	public void testValidateString_Valid() {
		// Test with a valid non-empty string
		boolean result = ValidateDepartMentEmployee.ValidadteString("Test");
		assertEquals(true, result);
	}

	@Test
	public void testValidateString_Null() {
		// Test with null input and expect an IllegalArgumentException
		assertThrows(IllegalArgumentException.class, () -> ValidateDepartMentEmployee.ValidadteString(null));
	}

	@Test
	public void testValidateString_Empty() {
		// Test with an empty string and expect an IllegalArgumentException
		assertThrows(IllegalArgumentException.class, () -> ValidateDepartMentEmployee.ValidadteString(""));
	}

	@Test
	public void testValidateRegex_Valid() {
		// Test with a valid string that matches the regex pattern
		boolean result = ValidateDepartMentEmployee.validateRegex("HR", "^[a-zA-Z ]+$");
		assertEquals(true, result);
	}

	@Test
	public void testValidateRegex_Invalid() {
		// Test with a string that does not match the regex pattern and expect an
		// IllegalArgumentException
		assertThrows(IllegalArgumentException.class,
				() -> ValidateDepartMentEmployee.validateRegex("HR12", "^[a-zA-Z ]+$"));
	}

	@Test
	public void testSplitInput_Valid() {
		// Test with a valid input string and check if the array is split correctly
		String[] result = ValidateDepartMentEmployee.splitInput("HR, John Doe");
		List<String> expectedList = Arrays.asList("HR", " John Doe");
		List<String> resultList = new ArrayList<>(Arrays.asList(result));
		assertEquals(expectedList, resultList);
	}

	@Test
	public void testSplitInput_Invalid() {
		// Test with an invalid input format and expect an IllegalArgumentException
		assertThrows(IllegalArgumentException.class, () -> ValidateDepartMentEmployee.splitInput("Invalid Input"));
	}
}
