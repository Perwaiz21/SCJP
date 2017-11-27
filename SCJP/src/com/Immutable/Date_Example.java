package com.Immutable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Example {

	public static void main(String[] args) {

		Date date = new Date(11-11-2017);
		//Date date = new Date();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd.MM.YYYY");
		
		System.out.println("Date of Today : "+ sdf1.format(date) );
		System.out.println(sdf1.format(new Date().getTime()));
		
	}

}
