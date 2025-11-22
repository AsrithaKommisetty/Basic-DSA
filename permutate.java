package sts;
import java.util.*;
public class permutate {
	public static void perm(char[]c,int fi) {
		if(fi==c.length) {
			for(int i=0;i<c.length;i++) {
				System.out.print(c[i]);
			}
			System.out.println();
		}
		for(int i=fi;i<c.length;i++) {
			swap(c,fi,i);
			perm(c,fi+1);
			swap(c,fi,i);
			
		}
	}
		public static void swap(char[]c,int s,int e) {
			char temp=c[s];
			c[s]=c[e];
			c[e]=temp;
			
			
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		perm(c,0);
		
	}

}
