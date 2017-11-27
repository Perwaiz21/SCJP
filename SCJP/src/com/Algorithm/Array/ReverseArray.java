package com.Algorithm.Array;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 23, 34, 1, 4, 7, 89, 12,100, 9, 13,15, 75,22, 45,33,21 };
		int temp = 0;
		int last = arr.length;

		for (int i = 0; i < last; i++) {
			System.out.print(arr[i]+" ");
		}

		for (int i = 0; i < last/2; i++) {

			temp = arr[i]; 
			arr[i] = arr[(last-1)-i];
			arr[(last-1)-i]= temp ;

		}
		System.out.println();
		for (int i = 0; i < last; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
