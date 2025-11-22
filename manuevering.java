package sts;
import java.util.*;
public class manuevering {
	public static int path(int x,int y,int r, int c) {
		if(x==r-1 || y==c-1) {
			return 1;
		}
		return path(x+1,y,r,c)+path(x,y+1,r,c);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(path(0,0,r,c));

	}

}
