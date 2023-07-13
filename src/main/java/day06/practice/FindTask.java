package day06.practice;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class FindTask {

//	method which will search for the task name in the array list
	public static boolean SearchEle(ArrayList<TaskDetails> arr, String find) throws IllegalArgumentException {

//		if the given task list is null or empty throw an new error
		if (arr == null || arr.size() == 0) {

			throw new IllegalArgumentException("Task list cannote be null or empty");

		}

//		if the given task name is null or empty throw an new error
		if (find == null || "".equals(find.trim())) {

			throw new IllegalArgumentException("Task name given to find is null or empty");
		}

//		task name must contains alphabets
		String pattern = "^[a-zA-Z ]{1,50}$";

		Boolean isMatch = Pattern.matches(pattern, find);

		// if isMatch holds false value throw new error
		if (Boolean.FALSE.equals(isMatch)) {
			throw new IllegalArgumentException(
					"Invalid task name to find. Given input doesn't match the requested format.");
		}

//		boolean to find task name is available or not
		boolean isSame = false;

		for (TaskDetails ele : arr) {

			if (find.equals(ele.taskName)) {

				isSame = true;
				break;

			}
		}

//		if there is no exception and task name is find return true otherwise false

		return isSame;

	}
}
