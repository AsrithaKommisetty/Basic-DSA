package sts;
import java.util.Scanner;
class Leaders{
    static public void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int res[]=new int[n];
        int c=0;
        for(int i=n-1;i>=0;i--){
            if(a[i]>max){
                max=a[i];
                res[c]=a[i];
                c++;
            }
        }
        for(int i=c-1;i>=0;i--) {
        	System.out.print(res[i]+" ");
        }
    }
}