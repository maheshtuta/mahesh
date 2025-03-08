package com.example.strings;

import java.util.Scanner;

public class SplitMethod {

	public static void main(String[] args) {
		System.out.println("Eneter the String ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] result = str.split(" ");
		 //for(String array : result)
        System.out.println(result.length);
	}

}
