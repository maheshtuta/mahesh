package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class JavaStream {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,3,5,2,7);
		//values.forEach(i->System.out.println(i)); //lamda
		
		//values.forEach(System.out::println); //method reffrence
		
		//values.forEach(JavaStream::double);
		
		//values.forEach(JavaStream::add);
		
		//values.stream().forEach(i->add(i));
		//values.parallelStream().forEach(i->add(i));

	}
//	public static void add(int i) {
//		System.out.println(i*2);
//	}

}