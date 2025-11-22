package exceptionHandling;

public class ThrowK {
	public static void method() {
		try {
			int age=17;
			if(age<18) {
				throw new ArithmeticException();
			}
		}
		catch(Exception e) {
			System.out.println("exception is caught, because age is <18");
		}
}

	public static void main(String[] args) {
		method();
	}

}
