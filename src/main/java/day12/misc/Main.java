package day12.misc;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		List<Employee> empDetails = new ArrayList<>();

		empDetails.add(new Employee(1, "John", 1000));
		empDetails.add(new Employee(2, "Wick", 3000));
		empDetails.add(new Employee(3, "Naresh", 2000));

		Employee empmaxSalary = null;
		int maxSalary = 0;

		for (Employee ele : empDetails) {

			if (ele.getSalary() > maxSalary) {

				maxSalary = ele.getSalary();
				empmaxSalary = ele;
			}
		}

		System.out.println(empmaxSalary);
	}
}
