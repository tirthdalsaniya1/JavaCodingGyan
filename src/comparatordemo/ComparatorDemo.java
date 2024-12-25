package comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice", 30));
		employees.add(new Employee("Charlie", 35));
		employees.add(new Employee("Bob", 25));

		System.out.println("Before sorting:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		// Sort using AgeComparator
		Collections.sort(employees, new AgeComparator());

		System.out.println("\nAfter sorting by age:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		// Sort using NameComparator
		Collections.sort(employees, new NameComparator());

		System.out.println("\nAfter sorting by name:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}