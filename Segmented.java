package sts;

import java.util.*;

class Segmented {
	public static void main(String[]args) {

	System.out.println("Enter the lower and upper bounds:");
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int h = sc.nextInt();

    boolean[] bool = new boolean[h - l + 1];
    for(int i=0;i<bool.length;i++) {
    	bool[i]=true;
    }

    // Sieve algorithm to mark non-primes
    for (int i = 2; i * i <= h; i++) {
        int start = Math.max(i * i, (l + i - 1) / i * i); // Find the starting index
        for (int j = start; j <= h; j += i) {
            bool[j - l] = false;
        }
    }

    int count = 0;
    int sum = 0;
    System.out.println("The prime numbers are:");
    for (int i = 0; i < bool.length; i++) {
        if (bool[i] && (i + l) >= 2) { // (i + l) represents the actual number
            System.out.println(i + l);
            count++;
            sum += (i + l);
        }
    }

    System.out.println("The total number of prime numbers is: " + count);
    System.out.println("The total sum of prime numbers is: " + sum);
    }
}
