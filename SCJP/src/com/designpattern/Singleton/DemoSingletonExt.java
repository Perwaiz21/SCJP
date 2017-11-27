package com.designpattern.Singleton;

public class DemoSingletonExt extends SingletonTest {

	public static SingletonTest getObject(){
		
		return instance;
	}
	
	public static void main(String[] args) {

	}

}
