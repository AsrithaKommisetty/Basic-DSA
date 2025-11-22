package exceptionHandling;

public class ThrowsK {
	public static void method1() throws Exception {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		try{
			method1();
		}
		catch(Exception e) {
			System.out.println("exception caught");
		}
	}

}
