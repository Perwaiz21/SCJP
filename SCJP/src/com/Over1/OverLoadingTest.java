package com.Over1;

public class OverLoadingTest {

	public String getObject(String s){
		String str = s;
		System.out.println("String method calling  :" + str);
		return str;
	}
	
	public Object getObject(Object obj){
		
		System.out.println("Object method calling : "+ obj);
		return obj;
	}
	
	public String getObject(String s1, String s2){
		System.out.println("String testing");
		return s1;
	}
	
	
	
	@Override
	public String toString() {
		return "OverLoadingTest";
	}

	public static void main(String[] args) {

		OverLoadingTest olt = new OverLoadingTest();
		olt.getObject(null);
		olt.getObject(null);
		olt.getObject(olt);
		//System.out.println(olt.getObject("ABC"));
		
	}

}
