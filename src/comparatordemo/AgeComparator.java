package comparatordemo;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		// Sort in ascending order
		return Integer.compare(e1.getAge(), e2.getAge());
	}

}
