package exceptionHandling;
import java.util.*;
import java.io.*;

public class FileEx {
	    public static void method1() throws FileNotFoundException{
	        FileInputStream f1= new FileInputStream("f1.txt");
	    }
	    public static void main(String[] args) {
	    	try{
	    		method1();
	    	}
	    	catch(FileNotFoundException e) {
	    		e.printStackTrace();
	    	}
	    }
}


	       
	


