package sts;
import java.util.*;
public class swapnibb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int z=(n & 0X0F)<<4|(n & 0XF0)>>4;
		System.out.println(z);
	}

}
