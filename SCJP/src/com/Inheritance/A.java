package com.Inheritance;

class B{
	
	{
		System.out.println(1);
	}
}

class C extends B
{
	{
		System.out.println(2);
	}
}

class D extends C{
	{
		System.out.println(3);
	}
}

public class A {
	
	public static void main(String args[]){
		
		D d = new D();
	}
}
