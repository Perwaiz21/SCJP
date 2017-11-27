package com.Immutable;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DOB_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar myCalendar = new GregorianCalendar(2013, 04, 10);
		Date myDate = myCalendar.getTime();
		
		System.out.println(myDate);
		
		Date date_1 = new Date();
		System.out.println(date_1.toString());
		System.out.println(date_1.getTime());
		
		System.out.println(date_1.getDate()+ "-"+date_1.getMonth()+"-"+(1900+date_1.getYear()));
		date_1.setDate(14);
		System.out.println(date_1.getDate()+ "-"+date_1.getMonth()+"-"+(1900+date_1.getYear()));
	}

}
