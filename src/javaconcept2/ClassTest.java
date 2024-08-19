package javaconcept2;

class Test123 {
	int i = 20;

	void m1() {
		System.out.println("Parent class m1");
	}
}

public class ClassTest extends Test123 {
	int i;

	void m1(int i) {
		this.i = i;
		System.out.println("child class m1 " + i);
	}
	
	ClassTest(){
		this(20);
	}
	
	ClassTest(int i){
		System.out.println(i);
	}

	void m2() {
		System.out.println("child class m2 ");
		m1(10);
		System.out.println(this.i);
	}

	public static void main(String[] args) {

		ClassTest c = new ClassTest();
		c.m2();
	}

}