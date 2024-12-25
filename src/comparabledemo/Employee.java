package comparabledemo;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;

	@Override
	public int compareTo(Employee o) {

		return Integer.compare(this.age, o.age);
	}
/*
	@Override
	public int compareTo(Employee o) {
		// Compare based on name in lexicographical (alphabetical) order
		return this.name.compareTo(o.name);
	}
*/
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}