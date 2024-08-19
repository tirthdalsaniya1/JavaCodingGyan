package javaconcept;

class ClassBcd {

	public ClassBcd() {
		System.out.println("inside parent class bcd");
	}
}

public class ClassAbc extends ClassBcd {

	public static void main(String[] args) {

		ClassAbc c = new ClassAbc();
	}

}
