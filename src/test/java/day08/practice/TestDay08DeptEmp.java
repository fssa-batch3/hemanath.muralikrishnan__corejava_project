package day08.practice;

import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class TestDay08DeptEmp {

	@Test
	public void testValidInput() {
		String input = "HR, John Doe\ndone";
		String expectedOutput = "HR: [John Doe]";

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));

		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);

		// Run the main method of DepartmentEmployee class
		DepartmentEmployee.main(new String[] {});

		// Add a short delay to allow the program to finish execution
		try {
			Thread.sleep(200); // Adjust the time if needed
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Get the printed output and verify
		String actualOutput = outputStream.toString().trim();
		assertEquals(expectedOutput, actualOutput);
	}

}
