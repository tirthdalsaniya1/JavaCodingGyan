package javaconcept;

class Main123 extends Abc {

	public static void main(String[] args) {
		Main123 m = new Main123();
		m.methodA();
		m.abstractMethod();

		System.out.println(m.a);
		System.out.println(m.b);

		System.out.println(Abc.b);
		Abc.methodC();

	}

	@Override
	public void abstractMethod() {
		System.out.println("inside child class method");

	}

}
