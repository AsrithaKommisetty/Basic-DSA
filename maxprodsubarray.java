package sts;
import java.util.*;
public class maxprodsubarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int p=1;
			for(int j=i;j<n;j++) {
				p=p*a[j];
				max=Math.max(max, p);
			}
		}
		System.out.println(max);

	}

}
