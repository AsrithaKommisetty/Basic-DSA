package fat.prep;
import java.util.*;
public class ConcurrentModificationDemo {
	
	public static void main(String[] args) {
		final List<Integer> list=new ArrayList<Integer>();
		Thread t1=new Thread(()->{
			for(int i=0;i<10;i++) {
				list.add(i);
			}
			System.out.println(list);
		});
		Thread t2=new Thread(()->{
			while(!list.isEmpty()) {
				list.remove(0);
			}
			System.out.println(list);
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	

}
