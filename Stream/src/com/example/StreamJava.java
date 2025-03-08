package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamJava {

	public static void main(String[] args) {
//convering given values to stream of strings
//		Stream<String> str = Stream.of("Java", "Python", "C++");
//		Long count = str.filter(i-> i.startsWith("J")).count();
//		System.out.println(count);
		
//sum of elements
        List<Integer> list =Arrays.asList(1,2,3,4);
//		int count = list.stream().reduce(0, (a,b)->a+b);
//		System.out.println(count);
        //int sum = list.stream().mapToInt(Integer::intValue).sum();
        //int sum=list.stream().reduce(0, (c,a)->(c+a));
        //max
        //int max = list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        
//Write a program to filter out all the even numbers from a list using Java Stream API
        //List<Integer> even = list.stream().filter(i-> i%2==0).collect(Collectors.toList());
        
//Given a list of strings, write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
       //List<String> list = Arrays.asList("mahesh", "prathyu", "naveen");
//        char searchValue='a';
//        long count=list.stream().filter(str-> str.contains(String.valueOf(searchValue))).count();
//Write a program to convert a list of strings to uppercase using Java Stream API.
        //List<String> convert = list.stream().map(String::toUpperCase).collect(Collectors.toList());
//Given a list of integers, write a program to calculate the average of all the numbers using Java Stream API.
        //OptionalDouble avegarge = list.stream().mapToInt(Integer::intValue).average();
//Write a program to sort a list of strings in alphabetical order using Java Stream API.
        
        //List<String>sorted = list.stream().sorted().collect(Collectors.toList());
// Given a list of strings, write a program to concatenate all the strings using Java Stream API. 
        //String concanate = list.stream().collect(Collectors.joining());
// Write a program to find the longest string in a list of strings using Java Stream API.
       // Optional<String> string = list.stream().max((str1, str2)->str1.length()-str2.length());
//Given a list of integers, write a program to find and print the second largest number using Java Stream API.
        //Optional<Integer> number = list.stream().sorted((num1, num2)-> num2-num1).skip(1).findFirst();
//Write a program to remove all the duplicate elements from a list using Java Stream API.  
       // List<Integer> numbers = list.stream().distinct().collect(Collectors.toList());
//Given a list of strings, write a program to find and print the shortest string using Java Stream API.
    //String Shortest = list.stream().min(Comparator.comparingInt(String::length)).orElse(null) ; 
//Given a list of strings, write a program to find and print the strings starting with a specific prefix ‘a’ using Java Stream API.       
//        String prefix="m";
//       List <String> string = list.stream().filter(str-> str.startsWith(prefix)).collect(Collectors.toList());
       
   //Write a program to find the product of all elements in a list of integers using Java Stream API.
       int number = list.stream().reduce(1, (a,b)->a * b);
        System.out.println(number);
	
	
		

	}
	

}
