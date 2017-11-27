package com.Algorithm.Array;

public class ArrayTwoNumberAdd {

	public static void main(String[] args) {

		int[] arr = { 2, 43, 6, 39, 34, 11, 3, 42, 45, 0 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] + arr[j] == 45) {

					System.out.println("(" + arr[i] + "," + arr[j] + ")");

				}
			}
		}

	}

}
