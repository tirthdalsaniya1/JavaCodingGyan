package multithreading;

public class MultiThreadingViaThreadClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread t = Thread.currentThread();
            System.out.println("Inside run method of MultiThreadingViaThreadClass class");
            System.out.println("id is " + t.getId() + " name is " + t.getName());
        }
    }

    public static void main(String[] args) {

        MultiThreadingViaThreadClass t = new MultiThreadingViaThreadClass();
        t.start();

        // Print the details of the main thread
        Thread mainThread = Thread.currentThread();
        System.out.println("Inside main method");
        System.out.println("Main thread id is " + mainThread.getId() + " name is " + mainThread.getName());

        // You can print new thread details here as well after it starts
        System.out.println("New thread id is " + t.getId() + " name is " + t.getName());
        
    }
}
