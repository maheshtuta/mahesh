package program.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ALPractice {

	public static void main(String[] args) {
		Integer [] arr = new Integer[] {1, 3, 4, 5};
		ArrayList<Integer> v1 = new ArrayList<>(Arrays.asList(arr));
		v1.add(12);
		//v1.add(0, null);
	ArrayList<Integer> v2 = new ArrayList<>();
	v2.add(23);
	//v1.addAll(v2);
		//System.out.println(v1.set(0, null));
		System.out.println(v1);
		Collections.synchronizedList(v1);
		
		

	}

}
