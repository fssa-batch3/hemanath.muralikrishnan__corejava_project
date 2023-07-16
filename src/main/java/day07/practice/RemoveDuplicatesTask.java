package day07.practice;

import java.util.HashSet;
import java.util.ArrayList;

public class RemoveDuplicatesTask {

//	method which will remove the duplicate task and return the unique task set
	public static HashSet<Task> taskRemove(ArrayList<Task> arr) throws IllegalArgumentException {

//		if the array list is null or size zero throw an error
		if (arr == null || arr.size() == 0) {

			throw new IllegalArgumentException("Task list cannot be null or emtpy");
		}

//		if the task list is not equal to null or empty then create new hashset without duplicates
		HashSet<Task> newSet = new HashSet<>();

//		using for each to iterate through the task array list 
//		and using equal methods object is same or not
//		if same I will not add in new set
//		if not same I will add in new set

		for (Task ele : arr) {
			// Check if the set already contains a task with the same name and deadline
			if (!newSet.contains(ele)) {

				newSet.add(ele);
			}
		}

//		if the new hashset is equal to the task list then there is no duplicates so throw no duplicates found

		if (newSet.size() == arr.size()) {

			throw new IllegalArgumentException("No duplicates found");
		}

//		if there is no exception then return the new set
		return newSet;
	}
}
