package javaconcept2;

public class InitializationOrderExample {

	static int staticVar = 10;
	int instanceVar = 20;
	static {
		System.out.println("inside Static block 1, staticVar = " + staticVar);
		staticVar = 30;
	}

	{
		System.out.println("Instance initializer block");
	}

	public InitializationOrderExample() {
		System.out.println("Constructor");
	}

	static void m2() {
		System.out.println("static method");
	}

	void someMethod() {
		System.out.println("Method");
	}

	public static void main(String[] args) {
		InitializationOrderExample.m2();
		InitializationOrderExample obj = new InitializationOrderExample();
		obj.someMethod();
	}
}
