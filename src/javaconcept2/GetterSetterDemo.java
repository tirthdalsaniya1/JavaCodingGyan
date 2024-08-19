package javaconcept2;

class Bvg {

	int i;
	int j;
	String str;

	void setValue(int i) {
		this.i = i;
	}

	public void getValue() {

		System.out.println("int value is " + i);
	}

}

public class GetterSetterDemo {

	public static void main(String[] args) {
		Bvg b = new Bvg();
		b.setValue(10);
		b.getValue();
	}

}
