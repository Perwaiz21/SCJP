package com.designpattern.Singleton;

public class SingletonTest {
	
	private static final SingletonTest instance = new SingletonTest();
	
	private SingletonTest(){
		
	}
	
	public static SingletonTest getObject(){
		
		return instance;
		
	}
	
	public String showData(){
		System.out.println("Nilofar");
		return "Nilofar";
	}

}
