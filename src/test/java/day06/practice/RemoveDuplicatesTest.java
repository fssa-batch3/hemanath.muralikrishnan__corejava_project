package day06.practice;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RemoveDuplicatesTest {

//	testing with valid inputs

	@Test
	public void testRemoveDuplicatesWithDuplicates() {

		List<String> cityList = new ArrayList<>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		List<String> expectedList = new ArrayList<>();
		expectedList.add("Chennai");
		expectedList.add("Bangalore");
		expectedList.add("Mumbai");

		List<String> actualList = RemoveDuplicates.removeDuplicates(cityList);

		assertIterableEquals(expectedList, actualList);
	}

//    testing without duplicate values

	@Test(expected = IllegalArgumentException.class)
	public void testRemoveDuplicatesWithNoDuplicates() throws Exception {

		List<String> cityList = new ArrayList<>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");

		RemoveDuplicates.removeDuplicates(cityList);
	}

//    testing the array list has null

	@Test(expected = IllegalArgumentException.class)
	public void testRemoveDuplicatesWithNull() throws Exception {

		List<String> cityList = null;

		RemoveDuplicates.removeDuplicates(cityList);
	}

//	testing the array list with size zero
	@Test(expected = IllegalArgumentException.class)
	public void testRemoveDuplicatesWithZeroSize() throws Exception {

		List<String> cityList = new ArrayList<>();

		RemoveDuplicates.removeDuplicates(cityList);

	}
}
