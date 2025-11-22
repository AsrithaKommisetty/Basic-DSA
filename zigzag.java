package sts;
import java.util.Arrays;
import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Read the number of elements
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read elements
        }

        findZigZagSequence(arr, n);
        arrangeAfterMidDescending(arr); // Arrange elements after mid in descending order
        scanner.close();
    }

    public static void findZigZagSequence(int[] arr, int n) {
        Arrays.sort(arr); // Sort the array

        int k = (n + 1) / 2; // Calculate k

        // Swap the last element of the increasing part with the last element of the array
        for(int i = k; i > 1; i--) {
            int temp = arr[i - 1];
            arr[i - 1] = arr[n - 1];
            arr[n - 1] = temp;
            n--;
        }

        
    }

    public static void arrangeAfterMidDescending(int[] arr) {
        int n = arr.length;
        int mid = n / 2; // Calculate midpoint

        // Extract elements after the mid-point
        int[] subArray = Arrays.copyOfRange(arr, mid, n);

        // Sort the sub-array in descending order
        Arrays.sort(subArray);
        for (int i = 0; i < subArray.length / 2; i++) {
            int temp = subArray[i];
            subArray[i] = subArray[subArray.length - 1 - i];
            subArray[subArray.length - 1 - i] = temp;
        }

        // Copy sorted elements back to the original array
        for (int i = mid; i < n; i++) {
            arr[i] = subArray[i - mid];
        }

        // Print the modified array after rearranging
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
