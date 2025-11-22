package sts;
import java.util.*;
public class weightedsubstr {
	
	
		public static int substr(String str,String str1, int t) {
			HashSet<String>hs =new HashSet<>();
			for(int i=0;i<str.length();i++) {
				int sum=0;
				String sub="";
				for(int j=i;j<str.length();j++) {
					int pos=str.charAt(j)-'a';
					int value=str1.charAt(pos)-'0';
					sum=sum+value;
					sub=sub+str.charAt(j);
					if(sum<=t) {
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
			int t=sc.nextInt();
			System.out.println(substr(str,str1,t));



	}

}