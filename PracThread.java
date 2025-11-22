package fat.prep;
import java.util.ArrayList;
class Thread23{
	ArrayList<Integer> lt=new ArrayList<Integer>();
	public void adde(int n){
		lt.add(n);
		System.out.println(Thread.currentThread().getName()+" "+lt);
		
	}
	public void removee(int i) {
		lt.remove(i);
		System.out.println(Thread.currentThread().getName()+" "+lt);
	}
}
class Thread22 implements Runnable{
	Thread23 st;
	Thread22(Thread23 st){
		this.st=st;
	}
	public void run() {
		st.adde(0);
		st.adde(10);
		st.adde(20);
		st.adde(30);
		st.removee(2);
		st.removee(0);
	}
	
}
public class PracThread {

	public static void main(String[] args) {
		Thread22 obj=new Thread22(new Thread23());
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("first ");
		t2.setName("second ");
		t1.start();
		t2.start();
		
	}

}
