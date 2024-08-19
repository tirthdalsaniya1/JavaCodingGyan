package javaconcept;

public interface I {

	public abstract String getMessage();

	public void doSomething0();

	abstract void doSomething();

	void doSomething123();

//	static void doSomething123();

//	final void doSomething123();

//	private abstract int calculateSum(int a, int b);

//	protected abstract int calculateSum2(int a, int b);

	static void staticDoSomething1() {
// this method is by deafult public so that you can call it from anywhere 
		System.out.println(123);
	}

	public static void staticDoSomething2() {

	}

	public default void defaultDoSomething1() {

	}

	default void defaultDoSomething2() {

	}

}