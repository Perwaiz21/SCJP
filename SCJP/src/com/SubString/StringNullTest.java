package com.SubString;

public class StringNullTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String str_1 = new String();
		str_1 = null;
		String str_2 = "ALi";
		if (str_1 != null || str_2 !=null){
			System.out.println("Hi its not null");
		}else
			System.out.println("Its null");
	}
}
