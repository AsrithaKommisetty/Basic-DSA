package sts;
import java.util.*;
public class Selectionsort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

		

	}

}
