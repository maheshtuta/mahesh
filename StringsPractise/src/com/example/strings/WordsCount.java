package com.example.strings;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		System.out.println("Eneter the String ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int count =1;
		 for (int i=0;i<str.length();i++)
		 {
			 if( (str.charAt(i)==' ') && (str.charAt(i+1) !=' '))
					 {
				          count++;
					 }
		 }
		 System.out.println(count);
//Method 2
//			System.out.println("Eneter the String ");
//			Scanner sc = new Scanner(System.in);
//			
//			String str = sc.nextLine();
//			String[] result = str.split(" ");
//			 //for(String array : result)
//	        System.out.println(result.length);
	}

}
