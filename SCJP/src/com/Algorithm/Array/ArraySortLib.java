package com.Algorithm.Array;

import java.util.Arrays;

public class ArraySortLib {

	public static void main(String[] args) {

		int arr[] = { 23, 4, 6, 7, 12, 45 };

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

		Arrays.sort(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" ");
		}

	}

}
