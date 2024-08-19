package javaconcept;

abstract public class Abc {

	int a;
	static int b = 10;

	private int c = 10;

	protected int d = 10;

	static void methodC() {
		System.out.println("methodA of Abstract class");

	}

	protected void methodA() {
		System.out.println("methodA of Abstract class");
	}

	public abstract void abstractMethod();

	private void methodB() {

		System.out.println("methodB of Abstract class");
	}
}
