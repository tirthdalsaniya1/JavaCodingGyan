package javaconcept;

public class ExtendAbstractClass1 extends AbstractClassDemo {

	void methodC() {
		System.out.println("inside c ");
	}

	@Override
	void methodB() {
		System.out.println("own methodB in class 1");
	}

	void methodA1() {
		System.out.println("a1");
	}

	void methodA() {
		System.out.println("inside a");
	}

	public static void main(String[] args) {
		ExtendAbstractClass1 e = new ExtendAbstractClass1();
		e.methodA();
	}

}
