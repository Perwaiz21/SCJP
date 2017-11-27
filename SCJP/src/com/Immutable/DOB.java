package com.Immutable;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public final class DOB {
	
	private final String Fname;
	private final String Lname;
	private final Calendar myCalendar = new GregorianCalendar(2013, 04, 10);
	private final Date date = myCalendar.getTime();
	
	public DOB(String fname, String lname) {
		super();
		this.Fname = fname;
		this.Lname = lname;
		//this.date = date;
	}

	public String getFname() {
		return Fname;
	}

	public String getLname() {
		return Lname;
	}

	/*public Date getDate() {
		return date;
	}*/
	
	public Date getDate() {
		return new Date(date.getTime());
	}
	
}
