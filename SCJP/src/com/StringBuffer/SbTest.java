package com.StringBuffer;

public class SbTest {

	public static void main(String[] args) {
		
		String str = new String("Perwaiz");
		StringBuffer sb = new StringBuffer("Perwaiz");
		
		
		/*System.out.println(str.toString()==sb.toString());
		System.out.println(str.toString().equals(sb.toString()));
		System.out.println(sb.toString().equals(str.toString()));*/
		
		System.out.println(str==sb);
		System.out.println(str.equals(sb));
		System.out.println(sb.equals(str));
		
		
		
		
		
	}

}
