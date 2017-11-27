package com.LinerSearch;

public class MyLinearSearch {

	public static void main(String[] args) {

		int arr[] = {1,22,345,2,6,78,90};
		int size = arr.length;
		
		int searchKey =35;
		
		for (int i =0; i<size;i++){
			
			if(arr[i] == searchKey){
				System.out.println("index :"+ i);
			}
		}
	}
}
