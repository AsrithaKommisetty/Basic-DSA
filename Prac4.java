package exceptionHandling;
class Demo1 implements Cloneable{
	static int a=5;
	public static void display() {
		System.out.println(a);
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class Prac4 {
	
	public static void main(String[] args) {
		try {
			Demo1 d1=new Demo1();
			d1.display();
			Demo1 d2=(Demo1)d1.clone();
			d2.display();
			d1.a=8;
			Demo1 d3=(Demo1)d1.clone();
			d3.display();
		}
		catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		
		
		
		
}
}