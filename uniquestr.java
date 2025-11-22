package sts;
import java.util.*;
public class uniquestr {
	
	public static void findpermuate(char ch[],int fi) {
		
		if(fi==ch.length) {
			for(int i=0;i<ch.length;i++) {
				System.out.print(ch[i]);
				
			}
			System.out.println();
			
			
		}
		
		else {
			for(int i=fi;i<ch.length;i++) {
				swap(ch,fi,i);
				findpermuate(ch,fi+1);
				swap(ch,fi,i);
			}
			
		}
		
	}
	public static void swap(char ch[],int s,int e) {
		char temp=ch[s];
		ch[s]=ch[e];
		ch[e]=temp;
	}

	public static void main(String[] args) {
		//ArrayList<Character> ar=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		findpermuate(ch,0);
		
		

	}

}
