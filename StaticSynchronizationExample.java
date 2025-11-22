package fat.prep;

public class StaticSynchronizationExample {
	int countA;
	static int countB;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Calls the static synchronized method
                incrementStatic();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Calls the non-static synchronized method
                new StaticSynchronizationExample().incrementNonStatic();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void incrementStatic() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Static Increment: " + (++countB));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void incrementNonStatic() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Non-Static Increment: " + (++countA));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
