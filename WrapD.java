package exceptionHandling;
import java.util.*;
public class WrapD {
	
	public static void main(String[] args) {
		String a="ArB67 *!";
		char[] ary=a.toCharArray();
		int alpha=0;
		int upper=0;
		int lower=0;
		int symbol=0;
		int digit=0;
		int space=0;
		for(int k=0;k<a.length();k++) {
			char c=a.charAt(k);
			if(Character.isAlphabetic(c)){
			    alpha++;
			}
			if(Character.isDigit(c)){
			    digit++;
			}
			if(Character.isUpperCase(c)){
			    upper++;
			}
			if(Character.isLowerCase(c)){
			    lower++;
			}
			if(Character.isWhitespace(c)){
			    space++;
			}
			symbol=ary.length-(digit+alpha+space);
		}
		System.out.println("no.of alphabets "+alpha);
		System.out.println("no.of digits "+digit);
		System.out.println("no.of upper case "+upper);
		System.out.println("no.of lower case "+lower);
		System.out.println("no.of spaces "+space);
		System.out.println("no.of symbols "+symbol);

	}

}
