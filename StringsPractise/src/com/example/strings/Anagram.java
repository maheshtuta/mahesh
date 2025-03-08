package com.example.strings;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isAnagram(String str1, String str2)
	{
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		if(str1.length()!= str2.length())
			
		{
			return false;
		}
		else
		{
			char c1 []= s1.toLowerCase().toCharArray();
			char c2 []= s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
		
	}

	public static void main(String[] args) {
		isAnagram("mahesh","sheham");
		
		
		

	}

}
