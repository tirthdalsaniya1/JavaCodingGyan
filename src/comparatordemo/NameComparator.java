package comparatordemo;

import java.util.Comparator;

class NameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		// Lexicographical sorting
		return e1.getName().compareTo(e2.getName());
	}
}