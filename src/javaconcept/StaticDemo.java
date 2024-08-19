package javaconcept;

public class StaticDemo {

	int x = 10;
	static int y = 12;
	static int a = 92;
	static {
		System.out.println(y);
		int b = 50;
		System.out.println(b);
	}

	public void f1() {
		int z = 20;
		System.out.println(z);
	}
	
	public static void f2() {
		int q=15;
		System.out.println(q);
	}


	public static void main(String args[]) {
		System.out.println(a);

		StaticDemo demo = new StaticDemo();
		demo.f1();
	}
}