package javaconcept;

public class Person {
	private String name;
	private int age;
	private static int count;
	private final String country = "USA";

	// Constructor to initialize name and age
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		count++; // Increment count for each new Person object created
	}

	// Overloaded constructor without age parameter
	public Person(String name) {
		this(name, 0); // Call another constructor to set age to 0
	}

	// Constructor that initializes name only
	public Person() {
		this("Unknown"); // Call another constructor to set name to "Unknown"
	}

	// Constructor that calls a superclass constructor
	public Person(String name, int age, String country) {
		this(name, age);
		System.out.println("Person is from " + country);
	}

	// Static method to get the count of Person objects created
	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		Person person1 = new Person("Alice", 30);
		System.out.println(person1.name + " is " + person1.age + " years old.");

		Person person2 = new Person("Bob");
		System.out.println(person2.name + " is " + person2.age + " years old.");

		Person person3 = new Person();
		System.out.println(person3.name + " is " + person3.age + " years old.");
		Person person4 = new Person("Charlie", 25, "Canada");
		System.out.println(person4.name + " is " + person4.age + " years old." + "from " + person4.country);
		System.out.println("Total Person objects created: " + Person.getCount());
	}
}
