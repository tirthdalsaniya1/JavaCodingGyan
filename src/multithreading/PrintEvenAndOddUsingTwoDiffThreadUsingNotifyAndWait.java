package multithreading;

public class PrintEvenAndOddUsingTwoDiffThreadUsingNotifyAndWait {
	// Note: here we have created two anonymous inner class for odd and even logic

	public static void main(String[] args) {

		Object lock = new Object();
		Thread oddThread = new Thread() {

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

		};
		Thread evenThread = new Thread() {

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

		};

		oddThread.setName("OddNumberThread");
		evenThread.setName("EvenNumberThread");

		oddThread.start();
		evenThread.start();

	}

}