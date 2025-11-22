package exceptionHandling;

public class CloningDemo implements Cloneable{
	int id = 1257;

	CloningDemo() {
		id = 1247;
	}

	public static void main(String args[]) {
		try {
			CloningDemo obj1 = new CloningDemo();
			System.out.println(obj1.id);
			
			CloningDemo obj2 = (CloningDemo) obj1.clone();
			System.out.println(obj2.id);
			
			obj1.id=100;
			
			System.out.println(obj2.id);
			
			CloningDemo obj3=obj1;
			System.out.println(obj3.id);
			
			if(obj1.equals(obj2))
				System.out.println("obj1 and obj2 are equal");
			
			if(obj1.equals(obj3))
				System.out.println("obj1 and obj3 are equal");
		} 
		catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
	}
}