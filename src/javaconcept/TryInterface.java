package javaconcept;

public interface TryInterface {

	int a = 10;
	public static final int b = 20;

	void methodA();

	static void methodB() {
		System.out.println("sttaic method b");
	}

	default void methodS() {
		System.out.println("default method s");

	}
}
