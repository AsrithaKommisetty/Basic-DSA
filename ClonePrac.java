package exceptionHandling;
import java.util.*;
class Demo3 implements Cloneable{
	static int id=100;
	public static void display() {
		System.out.println(id);
	}
		public Object clone()throws CloneNotSupportedException{
			return super.clone();
		}
	
	
}
public class ClonePrac {

	public static void main(String[] args) {
		try {
			Demo3 d1=new Demo3();
			d1.display();
			Demo3 d2=(Demo3)d1.clone();
			d2.display();
			
		}
		catch(CloneNotSupportedException e) {
			System.out.println("exception caught");
		}

	}

}
