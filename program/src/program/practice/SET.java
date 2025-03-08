package program.practice;

import java.util.*;

public class SET {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
//		Set<Integer> set1 = new HashSet<>();
//		set1.add(1);
//		set1.add(2);
//		set1.add(9);
//		//System.out.println(set1);
		set.add(9);
		set.add(8);
		set.add(10);
		//set.addAll(set1);
		//System.out.println(set);
		//set.contains(10);
		System.out.println(set.stream());

	}

}
