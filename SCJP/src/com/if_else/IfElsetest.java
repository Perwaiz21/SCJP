package com.if_else;

public class IfElsetest {

	public static void main(String[] args) {

		String r = "0";
		int x = -1;
		int y = -5;
		if (x < 5)
			if (y > 0)
				if (x > y)
					r += "1";
				else
					r += "2";
			else
				r += "3";
		else
			r += "4";
		System.out.println(r);

	}

}
