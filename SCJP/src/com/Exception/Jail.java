package com.Exception;

public class Jail {

	private int x =10;
	public static void main(String[] args) {
		
		 int x = 6;
		 new Jail().new Cell().slam();
	}
	class Cell{
		
		void slam(){
			System.out.println("Throw away key " + x);
		}
	}

}
