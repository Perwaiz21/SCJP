package com.FinalPack;

public class DemoFinalTestA {
	
	int i = 20;

	public static void main(String[] args) {
		
		int i =10;
		
		FinalTestA fta = new FinalTestA();
		System.out.println(fta.getId());
		
		int	idTest = fta.getId();
		idTest = 200;
		System.out.println(idTest);
		System.out.println(fta.getId());
	}

	{
		int i =12;
	}
	
}
