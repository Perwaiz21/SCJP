package com.polymorphism;

public class PrintTest extends PT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PrintTest p = new PrintTest();
		p.print();
		
	}

}

class PT{
	
	String s;
	
	/*PT(String s){
		this.s = s;
	}*/

	public void print(){
		System.out.println(s);
	}
}
