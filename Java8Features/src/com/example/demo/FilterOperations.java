package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOperations {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,22,27,56,24, 3, 4);
		//even numbers
	//list.stream().filter(x-> x%2==0).forEach(x-> System.out.println(x));
		//sum of all numbers
//		Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
//		System.out.println("sum of all numbers" +sum.get());
		//average of numbers
//		double avg = list.stream().mapToInt(a-> a).average().getAsDouble();
//		System.out.println("avg of all numbers" + avg);
		
	// square filter average
//		double avg = list.stream().map(e-> e*e).filter(e-> e>100).mapToInt(e-> e).average().getAsDouble();
//		System.out.println("sum of all numbers" +avg);
		
		//even numbers
//		List<Integer> even =list.stream().filter(e->e%2!=0).collect(Collectors.toList());
//		System.out.println(even);
		
		//print numbers starts with 2
		
//	List<Integer> number =list.stream().map(e-> String.valueOf(e)).filter(e-> e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
//	System.out.println(number);
		//2 nd type
		//list.stream().filter(e->e.toString().startsWith("2")).forEach(System.out::println);
	
		//print dublicate elements
		
//	Set<Integer> dublicate = list.stream().filter(e-> Collections.frequency(list, e)>1).collect(Collectors.toSet());
//	System.out.println(dublicate);
		//2nd type
		Set<Integer> temp = new HashSet<>();
		
		list.stream().filter(e-> !temp.add(e)).forEach(System.out::println);
		
	//max and min in list
//		 int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
//		 System.out.println(max);
//		
//		
//		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
//		 System.out.println(min);
		
		//ASEC and DESC
//	List<Integer> ASEC=	list.stream().sorted().collect(Collectors.toList());
//	System.out.println(ASEC);
//	
//List<Integer> DESC=	list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//System.out.println(DESC);
		
		//Get/ignore first 5 numbers using Limit & Skip in	
		
//	List<Integer> l= list.stream().limit(5).collect(Collectors.toList());
//	System.out.println(l);
//	
//	int sum =list.stream().skip(5).reduce((a,b)-> a+b).get();
//	System.out.println(sum);
		
	//Get Second Highest/Lowest Number using Streams	
//	int sec=	list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
//	System.out.println(sec);
//	
//	int secsmall =list.stream().sorted().skip(1).findFirst().get();
//	System.out.println(secsmall);
	}

}
