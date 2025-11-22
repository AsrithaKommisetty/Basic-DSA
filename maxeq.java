package sts;
import java.util.*;
public class maxeq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			//System.out.print(a[i]+" ");
		}
		//System.out.println();
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int p=0;
			int s=0;
			for(int j=0;j<=i;j++) {
				p=p+a[j];
			}
			for(int j=i;j<n;j++) {
				s=s+a[j];
			}
		
		if(p==s) {
			max=Math.max(max, p);
			
		}
		}
		System.out.println(max);
		

	}

}
