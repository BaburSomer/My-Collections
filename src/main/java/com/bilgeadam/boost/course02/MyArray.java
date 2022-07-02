package com.bilgeadam.boost.course02;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {
		int[] integers = new int[3];
		integers[0] = 1;
		integers[1] = 1;
		integers[2] = 2;
		//intArray[3] = 2; //==> ArrayIndexOutOfBoundsException
		
		String[] strings =  {"1", "abc", "3"};
		
		for (String string : strings) {
			System.out.println(string);
		}
		
		System.out.println(integers[2]);
		
		System.out.println(integers);
		System.out.println(Arrays.toString(integers));
		
		int[][] multiDimIntegers = {{1,2}, {3,4}, {5,6}, {7,8}};
		System.out.println(Arrays.toString(multiDimIntegers));
		System.out.println(Arrays.deepToString(multiDimIntegers));
	}
}
