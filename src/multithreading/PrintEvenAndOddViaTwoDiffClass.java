package multithreading;

public class PrintEvenAndOddViaTwoDiffClass {

	public static void main(String[] args) {
		PrintOddThread t = new PrintOddThread();
		t.setName("OddNumberThread");
		t.start();

		PrintEvenThread t1 = new PrintEvenThread();

		t1.setName("EvenNumberThread");
		t1.start();

	}

}

class PrintEvenThread extends Thread {

	@Override
	public void run() {

		for (int i = 2; i <= 100; i = i + 2) {

			String name = Thread.currentThread().getName();
			System.out.println("printed via " + name + " " + i);
		}

	}

}

class PrintOddThread extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 99; i = i + 2) {

			String name = Thread.currentThread().getName();
			System.out.println("printed via " + name + " " + i);
		}

	}

}