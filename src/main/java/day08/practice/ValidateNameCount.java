package day08.practice;

import java.util.regex.Pattern;
import java.util.Map;
import java.util.HashMap;

public class ValidateNameCount {

//	method which will return the hashmap and throws expection
	public static Map<String, Integer> generateMap(String s) throws IllegalArgumentException {

//		checking the string is not equal to null or emtpy
		if (s == null || "".equals(s.trim())) {

			throw new IllegalArgumentException("Input cannot be null or emtpy");
		}

//	    checking the input matching the pattern
		String pattern = "\\b\\w+(?:,\\s*\\w+)*\\b";

		Boolean isMatch = Pattern.matches(pattern, s.trim());

		if (!isMatch) {

			throw new IllegalArgumentException("Input doesn't match the requested format");
		}

//		 created new hashmap to store the key and value pair
		Map<String, Integer> nameMap = new HashMap<String, Integer>();

//		 split the given string using split
		String[] nameArr = s.split(",");

//		 iterating through the splited names and set into the

		for (String name : nameArr) {

			String sen = name.trim();
//			 checking in the hashmap the name is already available
//			 if there is already available then increase the count
			if (nameMap.containsKey(sen)) {

				nameMap.put(sen, nameMap.get(sen) + 1);
			}
//			 otherwise set the name with count 1

			else {

				nameMap.put(sen, 1);
			}

		}

//		return the hashmap
		return nameMap;
	}
}
