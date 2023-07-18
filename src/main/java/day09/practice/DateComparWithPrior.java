package day09.practice;

import java.util.Comparator;

public class DateComparWithPrior implements Comparator<TaskWithPriority> {

	public int compare(TaskWithPriority o1, TaskWithPriority o2) {

		PriorityComparator obj = new PriorityComparator();

		int sortOrder = 0;

//		comparing the both objects if it return 0 not change
//		if it return positive integer then a comes before b ASC: a < b -> -1 | DESC : a > b
//		if it return negative integer then b comes before a ASC: a > b -> 1 | DESC : a < b
//		if it return 0 then nothing will change a == b -> 0
		sortOrder = o1.getDeadline().compareTo(o2.getDeadline());

		if (sortOrder == 0) {

			sortOrder = obj.compare(o1, o2);
		}

		return sortOrder;

	}
}
