package com.Abstract;

abstract class Demo{
	
	int i =10;
	public abstract void Test();	
}

public class TestAbstract extends Demo {
	
	public void Test(){
		System.out.println("ABC");
	}
	public static void main(String[] args) {
		
		TestAbstract tab = new TestAbstract();
		tab.Test();
		System.out.println(tab.i);
	}
}
