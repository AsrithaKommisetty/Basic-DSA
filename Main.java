package fat.prep;
class Shop{
	private int stock;
	public synchronized void getStock() {
		if(stock==0) {
			try {
				for(int i=0;i<10;i++) {
					System.out.println("stock unavailable... waiting...");
					Thread.currentThread().sleep(50);;
					wait();
				}
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("stock available now... consuming...");
		stock--;
		System.out.println("available stock: "+stock);
	}
	public synchronized void putStock() {
		System.out.println("stock produced: "+stock);
		stock++;
		try {
			Thread.currentThread().sleep(50);;
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}
}
class Consumer extends Thread{
	private Shop stock;
	Consumer(Shop stock){
		super();
		this.stock=stock;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			stock.getStock();
		}
	}
}
class Producer extends Thread{
	private Shop stock;
	Producer(Shop stock){
		super();
		this.stock=stock;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			stock.putStock();
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Shop store=new Shop();
		Producer producer=new Producer(store);
		Consumer consumer=new Consumer(store);
		producer.start();
		consumer.start();
		

	}

}
