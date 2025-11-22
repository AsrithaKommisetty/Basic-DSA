package fat.prep;
class Grade{
	String g="A";
}
class Mark extends Thread{
	public void run() {
		for(int i=0;i<=15;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class Result extends Grade implements Runnable{
	public void run() {
		for(int i=0;i<=15;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class Threadsecond{
	public static void main(String[] args) {
		Mark m1=new Mark();
		m1.setName("MARK");
		m1.start();
		Result obj=new Result();
		Thread r1=new Thread(obj);
		r1.setName("RESULT1");
		Thread r2=new Thread(obj);
		r2.setName("RESULT2");
		r1.start();
		System.out.println(obj.g);
		r2.start();
		
		
	}
}