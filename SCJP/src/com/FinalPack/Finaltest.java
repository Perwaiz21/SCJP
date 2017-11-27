package com.FinalPack;

public class Finaltest {

	public Finaltest() {
		final String str = "ABC";
	}

	public static void main(String[] args) {

		Finaltest test = new Finaltest();
		final String str = "Hello World";
		System.out.println(str);
	}

}
