package com.Algorithm.Array;

import java.util.Arrays;

public class BinarySearchArray {

	static int arr[] = { 23, 4, 6, 7, 12, 45 };
	public static int binarySearch(int[] a, int fromIndex, int toIndex,
			int key) {
		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found.
	}

	public static void main(String[] args) {

		

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

		System.out.println();
		//System.out.println(Arrays.binarySearch(arr, 4));
		System.out.println(BinarySearchArray.binarySearch(arr, 0 ,arr.length,1));

	}

}
