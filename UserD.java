package exceptionHandling;
class User extends Exception{
	User(){
		}
	public String toString() {
		return "INVALID AGE";
	}
	
}
public class UserD {
	public static void method1() {
		try{
			int age=190;
			if(age<0 || age >150) {
				throw new User();
			}
			
		}
		catch(Exception e) {
			System.out.println("exception is handled");
			System.out.println(e);
		}
		finally {
			System.out.println("i am finally");
		}
		
	}

	public static void main(String[] args) {
		method1();
		
	}

}
