package javaconcept2;

class A {

	void m1() {
		System.out.println("inside class A m1 method");

	}
}

public class B extends A {
	void m1() {
		System.out.println("inside class B m1 method");
		super.m1();
	}

	void m2() {
		System.out.println("inside class B m2 method");

	}

	{
		this.m2();
	}

	public static void main(String[] args) {

		B th = new B();
		th.m1();
	}

}
