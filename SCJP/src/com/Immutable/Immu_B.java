package com.Immutable;

public class Immu_B {
	
	private String Fname;
	private String Lname;
	private String city;
	
	public Immu_B(String fname, String lname, String city) {
		
		this.Fname = fname;
		this.Lname = lname;
		this.city = city;
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
