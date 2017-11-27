package com.HashMap;

import java.util.HashMap;
import java.util.Set;

public class DemoEmployeeHashmap {

	public static void main(String[] args) {

		Employee e1 = new Employee("Kunal", 100);
		Employee e2 = new Employee("Kamal", 101);
		Employee e3 = new Employee("Kamalwa", 102);
		Employee e4 = new Employee("kamal", 101);

		HashMap<Employee, Integer> mp = new HashMap<Employee, Integer>();
		mp.put(e1, 20000);
		mp.put(e2, 40000);
		mp.put(e3, 60000);
		mp.put(e4, 80000);
		System.out.println(mp);
		System.out.println(mp.size());

		Set<Employee> keySet = mp.keySet();

		for (Employee empKey : keySet) {
			System.out.println(empKey);
		}
	}
}
