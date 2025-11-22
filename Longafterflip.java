package sts;
import java.util.*;

public class Longafterflip {
    public static int longestConsecutiveOnes(int n) {
        String binary = Integer.toBinaryString(n);
        int maxLength = 0;
        int currentLength = 0;
        int previousLength = 0;

        for (char bit : binary.toCharArray()) {
            if (bit == '1') { 
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength + previousLength + 1);
                previousLength = currentLength;
                currentLength = 0;
            }
        }

        // Check once more after the loop for sequences that end with a '1'
        maxLength = Math.max(maxLength, currentLength + previousLength + 1);
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Longest consecutive 1s after flipping one 0: " + longestConsecutiveOnes(n));
    }
}
