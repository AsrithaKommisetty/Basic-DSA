package fat.prep;

class MyThread implements Runnable {
	String name;

	 MyThread(String name) {
		this.name = name;
	}
	 public void run() {
		System.out.println("Thread " + name + " is running.");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread " + name + ": " + i);
		}
		System.out.println("Thread " + name + " is finished.");
	}
}

public class ThreadMain {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread("Thread 1"));
		Thread thread2 = new Thread(new MyThread("Thread 2"));
		Thread thread3 = new Thread(new MyThread("Thread 3"));

		thread1.setPriority(Thread.MIN_PRIORITY); // Set the lowest priority
		thread2.setPriority(Thread.NORM_PRIORITY); // Set the default priority
		thread3.setPriority(Thread.MAX_PRIORITY); // Set the highest priority

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
