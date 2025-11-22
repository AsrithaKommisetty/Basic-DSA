package fat.prep;

class Counter{
	private int count;
	public void getCount() {
		System.out.println(count);
	}
	public void increment() {
		for(int i=0;i<10;i++) {
			System.out.println(	Thread.currentThread().getName()+"="+i);
			count++;
		}
		}
}
class Mythreads extends Thread{
	private Counter count;
	Mythreads(Counter count){
		this.count=count;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			count.increment();
		}
	}
}
public class SynchronizationDemo {
	public static void main(String[] args) {
		Counter c=new Counter();
		Mythreads t1=new Mythreads(c);
		Mythreads t2=new Mythreads(c);
		t1.start();
		t2.start();
		t1.setName("thread1 ");
		t2.setName("thread2 ");
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
