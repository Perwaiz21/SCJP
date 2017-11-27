package com.HashMap;

import java.util.HashSet;
import java.util.Set;

public class EmployeWithSet {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ali", 100);
		Employee e2 = new Employee("Ali", 100);
		Employee e3 = new Employee("Ali1", 101);
		
		Set set = new HashSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		System.out.println(set);
		System.out.println(set.contains(e2));
		
		
	}

}
