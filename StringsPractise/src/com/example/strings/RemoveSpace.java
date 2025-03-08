package com.example.strings;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//welcome to java 
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				str.replace(" ","");
			}
		
			
	}
		System.out.println(str.replace(" ",""));
}
}