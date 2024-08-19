package javaconcept2;

import javaconcept.I;

public class ClassImolementsI implements I {

	public static void main(String[] args) {

		ClassImolementsI c = new ClassImolementsI();
		I.staticDoSomething1();
		I.staticDoSomething2();
		c.defaultDoSomething1();
		c.defaultDoSomething2();
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doSomething0() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSomething123() {
		// TODO Auto-generated method stub

	}

}
