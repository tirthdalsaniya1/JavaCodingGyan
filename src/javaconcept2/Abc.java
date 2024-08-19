package javaconcept2;

import javaconcept.TryInterface;

public class Abc implements TryInterface {

	@Override
	public void methodA() {
		System.out.println("Inside child methodA");
	}

	public void metodF() {
		System.out.println("Inside child methodF");

	}

	public static void main(String[] args) {
		TryInterface.methodB();
		Abc a = new Abc();
		a.methodS();
		a.methodA();
		a.metodF();
		System.out.println(a.a);
		System.out.println(TryInterface.a);
		System.out.println(TryInterface.b);

	}

}
