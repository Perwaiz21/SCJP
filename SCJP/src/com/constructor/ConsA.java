package com.constructor;

public class ConsA {

	public ConsA() {
		
		this(10);
		System.out.println("A");
	}
	
	public ConsA(int i){
		System.out.println("A-2");
	}
}