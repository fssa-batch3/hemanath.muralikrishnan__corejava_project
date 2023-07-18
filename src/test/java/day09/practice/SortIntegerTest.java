package day09.practice;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class SortIntegerTest {

//	test with valid inputs
	@Test
	public void testValidadteString_ValidInput() {
		assertTrue(ValidateSortNumbers.ValidadteString("1 2 3 4 5"));
	}

//    test with invalid inputs
	@Test(expected = IllegalArgumentException.class)
	public void testValidadteString_NullInput() {
		ValidateSortNumbers.ValidadteString(null);
	}

//    test with empty string
	@Test(expected = IllegalArgumentException.class)
	public void testValidadteString_EmptyInput() {
		ValidateSortNumbers.ValidadteString("");
	}

//    test with valid input with regex pattern
	@Test
	public void testValidateRegex_ValidInput() {
		assertTrue(ValidateSortNumbers.validateRegex("1 2 3 4 5", "\\d+(?: \\d+)*"));
	}

//    test with invalid input with regex pattern
	@Test(expected = IllegalArgumentException.class)
	public void testValidateRegex_InvalidInput() {
		ValidateSortNumbers.validateRegex("1a 2 3 4 5", "\\d+(?: \\d+)*");
	}

//    test with valid inputs returning the descending order list
	@Test
	public void testSortNumbers_ValidInput() {
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> result = ValidateSortNumbers.sortNumbers("5 4 3 2 1");
		assertIterableEquals(expected, result);
	}

//    test with invalid inputs like characters
	@Test(expected = IllegalArgumentException.class)
	public void testSortNumbers_InvalidInput() {
		ValidateSortNumbers.sortNumbers("1 2 a 4 5");
	}
}
