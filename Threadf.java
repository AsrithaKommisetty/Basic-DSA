package fat.prep;
class Threadd extends Thread{
	int cpu=1;
	public void run() {
		synchronized(this) {
			for(int i=0;i<10;i++) {
				System.out.println(cpu+" no of cpu cycles alloted to "+Thread.currentThread().getName());
				cpu++;
			}
		}
	}
}
public class Threadf {

	public static void main(String[] args) {
		Threadd t=new Threadd();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();

	}

}
