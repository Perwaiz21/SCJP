package com.Inheritance;

class Y {
	/*
	 * public Y(){ System.out.println(2); }
	 */

}

public class X extends Y{

	public X() {
		System.out.println(1);
	}

	public static void main(String arg[]) {

		new Y();
	}

}
