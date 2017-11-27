package com.Immutable;

public class Immu_A {
	
	private String Fname;
	private String Lname;
	private String city;
	
	public Immu_A(String Fname, String Lname, String city){
		this.Fname = Fname;
		this.Lname = Lname;
		this.city  = city;
	}
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
