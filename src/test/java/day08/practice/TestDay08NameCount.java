package day08.practice;

import static org.junit.Assert.*;
import java.util.HashSet;
import org.junit.Test;
import java.util.Map;
import java.util.HashMap;

public class TestDay08NameCount {

//	testing with valid inputs
	@Test
	public void testWithValidInputs() {

//		creating the expected hash map from the method
		Map<String, Integer> expectedMap = new HashMap<String, Integer>();
		expectedMap.put("Hemanath", 3);
		expectedMap.put("Joel", 3);
		expectedMap.put("Arun", 1);

//		calling the method to get the hashmap
		Map<String, Integer> acutalMap = ValidateNameCount
				.generateMap("Hemanath, Hemanath, Hemanath, Joel, Arun, Joel, Joel");

//		equaling the both acutalMap and expectedmap
		assertEquals(expectedMap, acutalMap);

	}

//	testing with null input
	@Test(expected = IllegalArgumentException.class)
	public void testWithNullInput() throws Exception {

//		calling the method to get the hashmap
		Map<String, Integer> acutalMap = ValidateNameCount.generateMap(null);

	}

//	testing with empty input
	@Test(expected = IllegalArgumentException.class)
	public void testWithEmptyInput() throws Exception {

//		calling the method to get the hashmap
		Map<String, Integer> acutalMap = ValidateNameCount.generateMap("     ");
	}

//	testing with invalid regex pattern
	@Test(expected = IllegalArgumentException.class)
	public void testWithInvalidRegex() throws Exception {

//		calling the method to get the hashmap
		Map<String, Integer> acutalMap = ValidateNameCount.generateMap("Spaces at the end");
	}
}
