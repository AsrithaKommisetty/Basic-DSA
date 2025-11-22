package sts;
import java.util.*;
class strobogrammatic {
  
    public static boolean isStrobogrammatic(String num) {
        
        int[] digitMapping = new int[] {0, 1, -1, -1, -1, -1, 9, -1, 8, 6};

        for (int left = 0, right = num.length() - 1; left <= right; ++left, --right) {
            int digitLeft = num.charAt(left) - '0';
            int digitRight = num.charAt(right) - '0';

           
            if (digitMapping[digitLeft] != digitRight) {
                return false;
            }
        }
     
        return true;
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String n=sc.nextLine();
    	if(isStrobogrammatic(n)) {
    		System.out.println(n+" is strob");
    	}
    	else {
    		System.out.println(n+" is not");
    	}
    }
}