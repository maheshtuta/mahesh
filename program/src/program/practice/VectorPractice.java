package program.practice;

import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {
		Object [] arr = new Object[] {1, 4, 5, 6};
	Vector<Integer> v1 = new Vector<>();
	v1.add(123);
	int sum = 0;
	for (int i=0; i<=v1.size(); i++)
	{
		sum +=(Integer) v1.get(i);
	}
	
	
	
	System.out.println(+sum);
	//System.out.println(v1.capacity());

	}

}
