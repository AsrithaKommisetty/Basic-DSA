package exceptionHandling;

/*public class CopyP {		
		static int x=10,y=0;
		public static void method1() throws ArithmeticException{
			System.out.println(x/y);
		}
		public static void method2() throws Exception{
			System.out.println(10/0);
		}
		public static void method4() throws RuntimeException{
			System.out.println(10/0);
		}
		public static void method5() throws ArithmeticException{
			System.out.println(10/0);
		}

		
		public static void main(String[] args) {
			try{
				method1();
				System.out.println("next");
				method2();
				method4();
				method5();
			}
			catch(Exception e) {
				System.out.println("exception at method1 "+e);
				y=2;
				method1();
				try {
				method2();
				}
				catch(Exception e1) {
					System.out.println("i am nested catch");
				}
			
			}
			finally {
				System.out.println("i am finally");
			}
		}

	}
*/
class Copy extends Exception{
	Copy(){	
	}
	public String toString() {
		return "Invalid age";
	}	
}
public class CopyP {
	public static void main(String[] args) {
		int age=-4;
		try {
			if(age<1 || age > 150)
				throw new Copy();
		}
		catch(Copy e) {
			System.out.println("i am catch for user defined exception");
			System.out.println(e);
		}
	}
}


