package com.HashCode;

public class HashCodeFind {

	public static void main(String[] args) {

		EmpHash emp_1 = new EmpHash();
		emp_1.setEmpId(1);
		emp_1.setEmpName("Animal");
		
		
		EmpHash emp_2 = new EmpHash();
		emp_2.setEmpId(2);
		emp_2.setEmpName("Party");
		
		EmpHash emp_3 = new EmpHash();
		emp_3.setEmpId(1);
		emp_3.setEmpName("Animal");
		
		
		System.out.println(emp_1.equals(emp_2));
		System.out.println(emp_1.equals(emp_3));
		
		System.out.println("HashCode of emp_1: "+emp_1.hashCode());
		System.out.println("HashCode of emp_2: "+emp_2.hashCode());
		System.out.println("HashCode of emp_3: "+emp_3.hashCode());
		
	}

}
