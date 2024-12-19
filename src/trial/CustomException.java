package trial;

public class CustomException {

	public static void main(String[] args) {
		testCustomException();
	}

	public static void testCustomException() {

		try {
			throw new InvalidAgeException();
		} catch (Exception e) {
			System.out.println("inside catch block");
			e.printStackTrace();
		}

	}

}
