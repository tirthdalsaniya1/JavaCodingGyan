package javaconcept2;

public class ProtectedClass {

	protected void methodA() {

		System.out.println("protected methodA");
	}

	public void methodB() {

		System.out.println("protected methodB");
	}

	void methodC() {
		System.out.println("default methodc");

	}

	public class classC {

		public void methodD() {
			System.out.println("Public methodD");

		}
	}

}
