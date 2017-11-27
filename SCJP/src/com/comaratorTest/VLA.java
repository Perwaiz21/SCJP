package com.comaratorTest;


public class VLA  {

	public VLA(int a){
		
	}
	
	static int dishSize;
	int dishSizeA;
	public static void main(String[] args) {
		
		VLA va[] = {new VLA(10), new VLA(20),new VLA(30)};
		dishSize = va.length;
		for(VLA v :va){
			System.out.println(v.dishSizeA);
		}
		System.out.println(dishSize);
	}

}
