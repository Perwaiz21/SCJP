package com.Exception;

import java.io.*;

public class TestException {

	public static void main(String[] args) {

		int i =10;
		int j =0;
		int k;
		
		try {
			k=i/j;
		} 
		catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception :");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Zero");
		}
		
		System.out.println("Hello World");
	}

}
