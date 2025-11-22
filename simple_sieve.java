package sts;
import java.util.*;
public class simple_sieve {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[] bool=new boolean[n];
        for(int i=0;i<n;i++)
            bool[i] = true;//make all the boolean value as true
		for(int i=2;i<Math.sqrt(n);i++){
			if(bool[i]==true) {
				for(int j=i*i;j<n;j=j+i) {
					bool[j]=false;
					}
				}
		}
		int count=0;
		int sum=0;
		System.out.println("the prime numbers are:");
		for(int i=2;i<bool.length;i++) {
			if(bool[i]==true) {
				System.out.println(i);
				count++;//to find the number of prime numbers
				sum=sum+i;//to find the sum of prime numbers
			}
		}
		
		System.out.println("The total number of prime numbers are:"+count);
		System.out.println("The total sum of prime numbers are:"+sum);
	}

}
