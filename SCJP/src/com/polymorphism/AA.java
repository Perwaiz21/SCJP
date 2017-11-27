package com.polymorphism;

import java.util.StringTokenizer;
import java.util.StringTokenizer.*;

public class AA extends StringTokenizer {

	public AA(String str) {
		super(str);
		// TODO Auto-generated constructor stub
		System.out.println("AA in constructor");
	}

	public static void main(String[] args) {

		AA a = new AA("AA");
	}

}
