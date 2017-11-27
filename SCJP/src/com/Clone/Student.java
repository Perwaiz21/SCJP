package com.Clone;

public class Student implements Cloneable {
	
	public Object clone() throws CloneNotSupportedException{
		return 	super.clone();
	}
	
	public int i =10;

	public Student(int i) {
		this.i = i;
		System.out.println("Value of i : "+ i);
	}
	
	

}
