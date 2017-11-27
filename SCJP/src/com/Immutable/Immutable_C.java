package com.Immutable;

import java.util.Date;

public final class Immutable_C {

	private String Fname;
	private String Lname;
	private String city;
	private Date date;

	public Immutable_C(String fname, String lname, String city, Date date) {
		super();
		this.Fname = fname;
		this.Lname = lname;
		this.city = city;
		this.date = date;
	}

	public String getFname() {
		return Fname;
	}

	public String getLname() {
		return Lname;
	}

	public String getCity() {
		return city;
	}

	public Date getDate() {
		return date;
	}

}
