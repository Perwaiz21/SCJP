package com.Duplicate;

public class ArrayValue {

	public static void main(String[] args) {
 
		String arr[] = new String[10];
		int arrq[] = new int[12];
		int arr2[] = {1,2,3,4,5,6};
		String sa[] = {"java","C","Python","java"};
		for(int i=0;i<sa.length;i++){
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i].equals(sa[j])){
					System.out.println(sa[i]);
				}
			}
		}
		
		
	}

}
