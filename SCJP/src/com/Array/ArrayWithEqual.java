package com.Array;

import java.util.Arrays;

public class ArrayWithEqual {

	public static void main(String[] args) {
		
		int[] arr_1 = {12,23,45,67,89};
		int[] arr_2 = {12,23,45,67,89};
		
		System.out.println(arr_1[0].equals(arr_2[0]));
		System.out.println(Arrays.deepEquals(arr_1, arr_2));
	}
	

}
