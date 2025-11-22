package exceptionHandling;

public class PracticeE {
	public static void method1()throws ArithmeticException{
		System.out.println(10/0);
	}
	public static void UserDefined() {
		int age=190;
		if(age<0 ||age>150) {
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args) {
		/*try{
			method1();
		}
		catch(ArithmeticException e) {
			System.out.println("exception is caught "+e);
		}*/
		try {
			UserDefined();
		}
		catch(ArithmeticException e1) {
			System.out.println("age can be less than 0 or more than 150");
			System.out.println(e1);
		}
		finally{
			System.out.println("exception is thrown by user defined method");
		}
	}

}
