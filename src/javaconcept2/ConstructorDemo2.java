package javaconcept2;

class Constr {

	public Constr() {
		System.out.println("parent no arg const");

	}

	public Constr(int a) {
		System.out.println("parent arg const");
	}

}

public class ConstructorDemo2 extends Constr {
	ConstructorDemo2() {
	//	this(10);
		System.out.println("child no arg");
	}

	ConstructorDemo2(int q) {
		this();
		System.out.println("child arg");
	}

	public static void main(String[] args) {
		ConstructorDemo2 c = new ConstructorDemo2();
	}

}
