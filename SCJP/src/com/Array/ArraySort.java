package com.Array;

public class ArraySort {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		//int len = arr.length/2;
		for(int k=0; k<arr.length; k++){
			System.out.println(arr[k]);
		}
		System.out.println("---------------------------------------");

		for (int i = 0; i < arr.length / 2; i++) {
			  int temp = arr[i];
			  arr[i] = arr[arr.length - 1 - i];
			  arr[arr.length - 1 - i] = temp;
			}
		for(int j =0;j<arr.length;j++){
		System.out.println(arr[j]);
		}
	}

}
