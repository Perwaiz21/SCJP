package com.Immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_String {

	public static void main(String[] args) {
		
		
		try {
			String birthDate = "23/11/2017";
			SimpleDateFormat sdfbirthdate = new SimpleDateFormat("dd/mm/yyyy");
			Date date = sdfbirthdate.parse(birthDate);
			SimpleDateFormat sdfbirthdat_1 = new SimpleDateFormat("yyyy-mm-dd");
			System.out.println(sdfbirthdat_1.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
