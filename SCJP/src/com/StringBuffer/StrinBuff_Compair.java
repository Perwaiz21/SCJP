package com.StringBuffer;

public class StrinBuff_Compair {

	public static void main(String[] args) {

		StringBuffer strBuf = new StringBuffer("Ali");
		StringBuffer strBuf_1 = new StringBuffer("Ali");
		String string = "Ali";
		
		
		
		if(strBuf.equals(string)){
			System.out.println("They are Equal");
		}
		else{
			System.out.println("They are NOT equal");
		}
		
		if(strBuf.equals(strBuf_1)){
			System.out.println("They are Equal");
		}
		else{
			System.out.println("They are NOT equal");
		}
		
	}

}
