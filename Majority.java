package sts;
import java.util.*;
class Majority{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int element=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(c==0)
            {
                element=a[i];
                c=1;
            }
            else if(a[i]==element)
            {
                c++;
            }
            else{
                c--;
            }
        }
        int cn1=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==element){cn1++;}
        }
        if(cn1>n/2)
        {
            System.out.print(element);
        }
        else{
            System.out.print("no majority");
        }
        }
}