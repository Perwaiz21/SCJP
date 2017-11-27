package com.SubString;

public class TestSubString {

	public static void main(String[] args) {

		String str = "Perwaiz";

		String subStr = str.substring(2);
		String subStr_1 = str.substring(2, 6);
		CharSequence subStr_2 = str.subSequence(3, 6);

		System.out.println(subStr);
		System.out.println(subStr_1);
		System.out.println(subStr_2);

	}

}
