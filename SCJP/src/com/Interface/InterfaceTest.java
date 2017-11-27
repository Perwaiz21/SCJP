package com.Interface;

public class InterfaceTest implements Num_1, Num_2 {
	
	public void numCall(){
		System.out.println("No difference");
	}

	public static void main(String[] args) {

		InterfaceTest it = new InterfaceTest();
		System.out.println(it.i);
		
		it.numCall();
	}

}
