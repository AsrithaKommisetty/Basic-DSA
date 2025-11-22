package sts;
import java.util.*;

class nqueens {
    
    // Function to solve N-Queens problem
    public static boolean queen(int b[][], int c, int n) {
        if (c == n) {
            // If we've placed queens in all columns, the solution is found
            printSolution(b, n);
            return true;
        }
        
        for (int r = 0; r < n; r++) {
            // Check if it's safe to place the queen at (r, c)
            if (safe(b, r, c, n)) {
                // Place the queen
                b[r][c] = 1;
                // Recur to place the next queen
                if (queen(b, c + 1, n)) {
                    return true; // If placing the queen at (r, c) leads to a solution, return true
                }
                // Backtrack if placing the queen at (r, c) doesn't work
                b[r][c] = 0;
            }
        }
        
        return false; // If no valid position is found, return false
    }

    // Function to check if it's safe to place a queen at (r, c)
    public static boolean safe(int b[][], int r, int c, int n) {
        // Check column
        for (int i = 0; i < c; i++) {
            if (b[r][i] == 1) {
                return false; // There's already a queen in the same row in this column
            }
        }
        
        // Check upper diagonal
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (b[i][j] == 1) {
                return false; // There's already a queen in the upper diagonal
            }
        }
        
        // Check lower diagonal
        for (int i = r, j = c; i < n && j >= 0; i++, j--) {
            if (b[i][j] == 1) {
                return false; // There's already a queen in the lower diagonal
            }
        }
        
        return true; // It's safe to place the queen at (r, c)
    }

    // Function to print the board
    public static void printSolution(int b[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input the size of the board
        int b[][] = new int[n][n]; // Initialize the board
        
        // Start solving the N-Queens problem
        if (!queen(b, 0, n)) {
            System.out.println("Solution does not exist.");
        }
        
        sc.close();
    }
}