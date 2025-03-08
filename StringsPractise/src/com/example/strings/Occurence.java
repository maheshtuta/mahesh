package com.example.strings;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=0;
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
