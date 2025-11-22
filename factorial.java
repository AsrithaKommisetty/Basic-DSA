package sts;
import java.util.*;
public class factorial {
	public static void m1(int n) {
		int sum=0;
		int digit=0;
		while(n>0 || sum>9) {
			
			if(n==0) {
				n=sum;
				sum=0;
			}
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(sum);
		int fact=1;
		for(int i=1;i<=sum;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		m1(n);

	}

}
