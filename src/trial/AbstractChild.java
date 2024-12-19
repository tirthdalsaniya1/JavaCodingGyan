package trial;

public class AbstractChild extends AbstractClassM {

	public static void main(String[] args) {
		
		AbstractChild m = new AbstractChild();
		m.m1();
		m.m2();
		m.ownm3();
	}

	@Override
	protected void m1() {
		System.out.println("inside m1 method of child class");

	}

	void ownm3() {
		System.out.println("own m3");
	}

}
