package sts;
import java.util.*;
import java.lang.*;
import java.io.*;

class numberof1s
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int num[]=new int[n];
	    for(int i=0;i<n;i++){
	        
	        int count=0;
	        int value=a[i];
	        while(value!=0){
	            if(value%2==1){
	                count++;
	            }
	            value=value/2;
	            
	        }
	        num[i]=count;
	        
	    }
	    for(int i=0;i<n;i++){
	        System.out.println(num[i]);
	    }
	    

	}
}
