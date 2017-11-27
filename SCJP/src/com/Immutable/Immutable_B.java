package com.Immutable;

public final class Immutable_B {

	private final String Fname;
	private final String Lname;
	private final String city;
	
	
	
	public Immutable_B(String fname, String lname, String city) {
		super();
		this.Fname = fname;
		this.Lname = lname;
		this.city = city;
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
	
	
	
	
}
