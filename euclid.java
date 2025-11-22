package sts;
import java.util.*;
public class euclid {
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int r=gcd(a,b);
		System.out.println(r);
	}

}
