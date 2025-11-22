package fat.prep;
class Thread21 extends Thread{
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
public class Threadfirst{
	public static void main(String[] args) {
		Thread21 t1 = new Thread21();
		t1.setName("FIRST ");
		t1.start();
		Thread21 t2 = new Thread21();
		t2.setName("SECOND");
		t2.start();
	}
	
	
}