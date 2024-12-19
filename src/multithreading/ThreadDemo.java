package multithreading;

public class ThreadDemo implements Runnable {
	
	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			Thread t = Thread.currentThread();

			System.out.println(t.getId());
			System.out.println(t.getName());

		}
	}

	public static void main(String[] args) {

		ThreadDemo d = new ThreadDemo();
		
		Thread t = new Thread(d);
		
		t.start();
	}

}
