package sts;
import java.util.*;
class queens {
    public static boolean queen(int b[][],int c,int n){
        if(c==n){
        	for(int i=0;i<n;i++) {
        		for(int j=0;j<n;j++) {
        			System.out.print(b[i][j]+" ");
        		}
        		System.out.println();
        	}
        	System.out.println();
            return true;
        }
        for(int r=0;r<n;r++){
            if(safe(b,r,c,n)){
                b[r][c]=1;
                if(queen(b,c+1,n)) {
                	return true;
                }
            
                b[r][c]=0;
            }
        }
        return false;
    }
    public static boolean safe(int b[][],int r,int c,int n){
        for(int i=0;i<c;i++){
            if(b[r][i]==1){
                return false;
            }
        }
        for(int i=r,j=c;i>=0 && j>=0;i--,j--){
            if(b[i][j]==1){
                return false;
            }
        }
        for(int i=r,j=c;i<n && j>=0;i++,j--){
            if(b[i][j]==1){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b[][]=new int[n][n];
        if(!queen(b,0,n)) {
        	System.out.println("no solution");
        }
        
    }
}