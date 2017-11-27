package com.CopyConstructor;

public class TestCopyConstructor {

	public static void main(String[] args) {

		CopyCons cc = new CopyCons(1);
		cc.i = 10;
		System.out.println(cc.i);
		CopyCons ccCopy = new CopyCons(cc);
		
		System.out.println(ccCopy.i);
		ccCopy.i =15;
		System.out.println(cc.i);
		System.out.println(ccCopy.i);
		
	}

}
