package com.example.strings;

import java.util.Scanner;

public class Numberofoccurrences {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = str.length();
		int str1 = str.replace("h", "").length();
		int sum = length-str1;
		System.out.println(sum);

	}

}
