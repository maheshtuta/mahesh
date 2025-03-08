package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class StreamConcept {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,10,4,5);
		//int result=0;
//		for(int i:values)//enhanced for loop
//		{
//		  result= result+i*2;
//		}
//		System.out.println(result);
		//System.out.println(values.stream().map(i-> i*2).reduce(0,(c,e)-> c+e));
		//System.out.println(values.stream().map(i-> i*2).reduce(0, Integer::sum));
		//System.out.println(values.stream().filter(i->i%5==0).reduce(0, (c,e)->c+e));
		System.out.println(values.stream().filter(i->i%5==0).findFirst().orElse(0));

	}

}
