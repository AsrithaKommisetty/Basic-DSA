package fat.prep;

import java.util.*;

public class GenericMemberDemo {
	
	
	static <Type> void add(Type a, Type b) {
		System.out.println(a.getClass());
		System.out.println(b.getClass());
		if(a.getClass().getName().equals("java.lang.Integer"))
		{
			if(b.getClass().getName().equals("java.lang.Integer")) {
				int x=(int) a;
				int y=(int) b;
				System.out.println(x+y);	
			}
		}
		System.out.println();
	}

	static void add(int a,int b) {
		System.out.println("int"+a+b);
	}
	
	static void add(float a,float b) {
		System.out.println("float"+a+b);
	}
	static <Type extends Number> void add(Type a, Type b) {
		double x = a.doubleValue();
		double y = b.doubleValue();
		System.out.println(x + y);
	}

	static <Type> void add(Type a, int b) {
		System.out.println(a.getClass());
		System.out.println(b);
	}

	public static void main(String[] args) {
		add(10.2f,20.4);
		add(new Integer(10),new Integer(20));
		add(12.3,12.4);
		add("hai","12");
		GenericMemberDemo ob1=new GenericMemberDemo();
		GenericMemberDemo ob2=new GenericMemberDemo();
		add(ob1,ob2);
	}
}

