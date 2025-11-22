package sts;
import java.util.*;
public class BinaryPalindromeChecker {
	static boolean BinaryPalindrome(int x) {
		int rev = 0;
		int ori = x;
        while (x > 0) {
        	rev <<= 1; 
        	rev = rev|(x & 1); 
        	x >>= 1;
        }
        return rev==ori;
        }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
        if (BinaryPalindrome(x)) {
        	System.out.println(x + " has a binary palindrome representation.");
        } 
        else {
        	System.out.println(x + " does not have a binary palindrome representation.");
        }
 }
}