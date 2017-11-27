package com.constructor;

public class ConsC extends ConsB {

	public ConsC(){
		this(10);
		System.out.println("C");
	}
	
	public ConsC(int i){
		System.out.println("C-2");
	}
}
