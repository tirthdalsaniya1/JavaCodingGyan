package javaconcept;

public class ConstructorDemo {

	int age;
	String name;
	String country;
	static int count;

	public ConstructorDemo() {
		this("Sachin");

	}

	public ConstructorDemo(String name) {
		this(20, name);

	}

	public ConstructorDemo(int age, String name) {
		this(age, name, "India");
	}

	static int getCount() {
		return count;
	}

	public ConstructorDemo(int age, String name, String country) {
		this.age = age;
		this.name = name;
		this.country = country;

		count++;

	}

	public static void main(String[] args) {

		ConstructorDemo cdemo = new ConstructorDemo();
		System.out.println("Age is " + cdemo.age);
		System.out.println("Name is " + cdemo.name);
		System.out.println("country is " + cdemo.country);

		ConstructorDemo cdemo1 = new ConstructorDemo("Amit");
		System.out.println("Age is " + cdemo1.age);
		System.out.println("Name is " + cdemo1.name);
		System.out.println("country is " + cdemo1.country);

		ConstructorDemo cdemo2 = new ConstructorDemo(12, "Pavan");
		System.out.println("Age is " + cdemo2.age);
		System.out.println("Name is " + cdemo2.name);
		System.out.println("country is " + cdemo2.country);

		ConstructorDemo cdemo3 = new ConstructorDemo(12, "Jay", "USA");
		System.out.println("Age is " + cdemo3.age);
		System.out.println("Name is " + cdemo3.name);
		System.out.println("country is " + cdemo3.country);
		System.out.println(count);
	}

}
