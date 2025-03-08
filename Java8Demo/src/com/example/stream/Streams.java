package com.example.stream;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,4,5,6,7,8,9,10);
	
		Stream<Integer>listinteger = list.stream().filter(i->i%2==0);
		
		listinteger.forEach(i-> {
			System.out.println(i);
		});
	 
		
		
	}


}

