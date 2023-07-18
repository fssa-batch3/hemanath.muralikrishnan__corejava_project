package day07.practice;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashSet;
import org.junit.Test;

public class TestDay07PrintUnique {

//	testing with valid inputs

	@Test
	public void testWithValidInputs() {

//		creating new array list
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(3);

//		creating new hashset
		HashSet<Integer> actualSet = new HashSet<>();
		actualSet.add(1);
		actualSet.add(3);
		actualSet.add(5);
		actualSet.add(6);

//		calling the method which will return the unique hashset
		HashSet<Integer> expectedSet = PrintUnique.generateSet(list);

//		checking the acutal set and expected set is equal

		assertIterableEquals(actualSet, expectedSet);

	}

//	testing the array list with null input

	@Test(expected = IllegalArgumentException.class)
	public void testWithNullInput() throws Exception {

//		creating new array list
		ArrayList<Integer> list = null;

//		calling the method which will return the unique hashset
		HashSet<Integer> expectedSet = PrintUnique.generateSet(list);

	}

//	testing the array list with zero size

	@Test(expected = IllegalArgumentException.class)
	public void testWithZeroSize() throws Exception {

//		creating new array list
		ArrayList<Integer> list = new ArrayList<>();

//		calling the method which will return the unique hashset
		HashSet<Integer> expectedSet = PrintUnique.generateSet(list);

	}
}
