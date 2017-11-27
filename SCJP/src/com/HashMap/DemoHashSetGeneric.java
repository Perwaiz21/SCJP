package com.HashMap;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSetGeneric {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ali", 100);
		Employee e2 = new Employee("Perwaiz", 200);
		Employee e3 = new Employee("John", 300);
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		System.out.println(set);
		
	}

}
