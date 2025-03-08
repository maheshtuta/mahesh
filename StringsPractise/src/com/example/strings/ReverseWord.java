package com.example.strings;

public class ReverseWord {

	public static void main(String[] args) {
		String str = "welcome to java";
		String [] array = str.split(" ");
		String reverseString="";
		for(String word:array)
			
		{
			String reverseWord="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+word.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		
		System.out.println(reverseString);

	}

}
