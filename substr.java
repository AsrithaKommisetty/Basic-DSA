package sts;
import java.util.*;
public class substr {
	
	public static int findsubstr(String s,String w,int tar) {
		
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			int sum=0;
			String sub="";
			for(int j=i;j<s.length();j++) {
				int pos=s.charAt(j)-'a';
				int value=w.charAt(pos)-'0';
				sum=sum+value;
				sub=sub+s.charAt(j);
				if(sum<=tar) {
					hs.add(sub);
				}
				else {
					break;
				}
				
			}
		}
		return hs.size();
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		int tar=sc.nextInt();
		System.out.println(findsubstr(str,str1,tar));

	}

}
