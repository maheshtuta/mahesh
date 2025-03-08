package com.example.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//method 1
//		StringBuilder sb = new StringBuilder(str);
//		StringBuilder str1 = sb.reverse();
//		System.out.println(str1.toString());
 //method 2
		String rev="";
		for( int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println(rev.toString());
	}

}

