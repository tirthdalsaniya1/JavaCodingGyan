package javaconcept2;

public class ClassInitialization {

	static int staticVar = 10;
	int instanceVar = 20;

	static {
		System.out.println("staticVar value inside first static block is " + staticVar);
		System.out.println("Static block 1 executed");
		staticVar = 30;
	}

	{
		System.out.println("instanceVar value inside first static block is " + instanceVar);
		System.out.println("Instance block 1 executed");
		instanceVar = 40;
	}

	ClassInitialization() {
		System.out.println("instanceVar value inside Constructor is " + instanceVar);
		System.out.println("Constructor executed");
		instanceVar = 50;
	}

	{
		System.out.println("instanceVar inside Instance block 2 is " + instanceVar);
		System.out.println("Instance block 2 executed");
		instanceVar = 60;
	}

	static {
		System.out.println("staticVar value inside Static block 2 is " + staticVar);
		System.out.println("Static block 2 executed");
		staticVar = 70;
	}

	public static void main(String[] args) {
		new ClassInitialization();
	}

}