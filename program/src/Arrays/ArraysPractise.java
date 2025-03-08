package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements into array");
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
			
		}
		int largest = arr[0];
		int index =0;
		for(int i=0;i<arr.length;i++) {
			if( largest<arr[i])
				largest=arr[i];
			index=i;
		}
		System.out.println("largest"+largest);
		System.out.println("index"+index);
		
		
	}

}
