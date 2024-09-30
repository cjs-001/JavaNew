package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="charan";
		String b=new String("loves");
		char[] arr= {'c','r','i','c','k','e','t'};
		String c= new String(arr);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a+b+c);
		System.out.println(a.concat(b).concat(c));
		
		System.out.println(a.charAt(0));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		char arr1[]= new char[6];
		a.getChars(2, 6, arr1, 0);
		System.out.println(arr1);
		
		String[] asd =a.split("h",2);
		System.out.println(asd[0]);
		
		
		
	}

}
