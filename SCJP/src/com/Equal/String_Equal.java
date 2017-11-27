package com.Equal;

public class String_Equal {

	public static void main(String[] args) {

		String s1 = "Hey Ali";
		String s2 = "Hey Ali";
		String s3 = s2;
		
		if(s1 == s2){
			System.out.println("They are equals.");
		}
		else{
			System.out.println("They are NOT equals.");
		}
		
		if(s1 == s3){
			System.out.println("They are equals.");
		}
		else{
			System.out.println("They are NOT equals.");
		}
		
		
		if(s1.equals(s2)){
			System.out.println("They are equals.");
		}
		else{
			System.out.println("They are NOT equals.");
		}
		
	}

}
