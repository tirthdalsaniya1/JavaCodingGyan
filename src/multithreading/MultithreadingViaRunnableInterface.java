package multithreading;

public class MultithreadingViaRunnableInterface implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread t = Thread.currentThread();
            System.out.println("Inside run method of MultithreadingViaRunnableInterface class");
            System.out.println("Thread ID is " + t.getId() + " and Thread Name is " + t.getName());
        }
    }

    public static void main(String[] args) {
        MultithreadingViaRunnableInterface m = new MultithreadingViaRunnableInterface();
        Thread t = new Thread(m);

        System.out.println("Main Thread ID is " + Thread.currentThread().getId() + " and Main Thread Name is " + Thread.currentThread().getName());

        t.start();
    }
}
