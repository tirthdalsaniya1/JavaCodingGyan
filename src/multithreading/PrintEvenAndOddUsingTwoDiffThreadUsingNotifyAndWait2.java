package multithreading;

public class PrintEvenAndOddUsingTwoDiffThreadUsingNotifyAndWait2 {
//Note: here we have created two separate class for odd and even and then in 3rd class tried to start those thread
	public static void main(String[] args) {
		Object lock = new Object();
		PrintOddViaOneThread oddThread = new PrintOddViaOneThread(lock);
		PrintEvenViaOneThread evenThread = new PrintEvenViaOneThread(lock);
		oddThread.setName("OddNumberThread");
		evenThread.setName("EvenNumberThread");

		oddThread.start();
		evenThread.start();

	}
}

class PrintOddViaOneThread extends Thread {
	private final Object lock;

	public PrintOddViaOneThread(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {

			for (int i = 1; i <= 99; i = i + 2) {

				String name = Thread.currentThread().getName();
				System.out.println("printed via " + name + " " + i);
				lock.notify(); // Notify the other thread
				try {
					if (i < 99) {
						lock.wait();
					}
				} catch (InterruptedException e) {

					e.printStackTrace();
				} // Wait for the other thread
			}

		}

	}

}

class PrintEvenViaOneThread extends Thread {

	private final Object lock;

	public PrintEvenViaOneThread(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {

		synchronized (lock) {
			for (int i = 2; i <= 100; i = i + 2) {

				String name = Thread.currentThread().getName();
				System.out.println("printed via " + name + " " + i);
				lock.notify(); // Notify the other thread
				try {

					if (i < 100) {
						lock.wait();
					}
				} catch (InterruptedException e) {

					e.printStackTrace();
				} // Wait for the other thread

			}
		}
	}

}