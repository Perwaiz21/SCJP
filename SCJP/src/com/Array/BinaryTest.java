package com.Array;

import java.util.Arrays;

public class BinaryTest {

	public static void main(String[] args) {
		
		int[] arr = {12,34,13,89,46};
		int index = Arrays.binarySearch(arr, 34);
		System.out.println(index);
		Arrays.sort(arr);
		Arrays.deepHashCode(arr[0]);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

}
