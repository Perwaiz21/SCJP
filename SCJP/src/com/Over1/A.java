package com.Over1;

public class A {

	public void Test(){
		System.out.println("Test is calling from A (Test)");
	}
	
	public int Test2(int value){
		int j = value;
		System.out.println("Calling from A(Test(int)) value : " +  j);
		return j;
	}
	public static void main(String[] args) {

		
	}

}
