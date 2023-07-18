package day09.practice;

import java.util.Comparator;

public class PriorityComparator implements Comparator<TaskWithPriority> {

	public int compare(TaskWithPriority o1, TaskWithPriority o2) {

		if (o1.getPriority() < o2.getPriority()) {

			return -1;
		} else if (o1.getPriority() > o2.getPriority()) {

			return 1;
		} else {

			return 0;
		}
	}

}
