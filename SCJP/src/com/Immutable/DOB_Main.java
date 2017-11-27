package com.Immutable;

public class DOB_Main {

	public static void main(String[] args) {

		DOB dob = new DOB("Perwaiz", "Ali");
		
		dob.getDate().setYear(2017);
		
		System.out.println(dob.getFname()+" "+ dob.getLname()+ " "+ (1900+dob.getDate().getYear()));
		
	}

}
