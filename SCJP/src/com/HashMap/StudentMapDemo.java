package com.HashMap;

import java.util.HashMap;

public class StudentMapDemo {

	public static void main(String[] args) {
		
		Student std_1 = new Student(100,"Ali");
		Student std_2 = new  Student(200,"Gaurav");
		Student std_3 = new Student(300, "Paritosh");
		Student std_4 = new Student(100, "Ali");
		
		HashMap<Student,String> mp = new HashMap<Student,String>();
		
		mp.put(std_1, "Physics");
		mp.put(std_2, "Chemistry");
		mp.put(std_3, "Bilogy");
		mp.put(std_4, "Computer Science");
		
		System.out.println(mp.size());
		System.out.println();
		System.out.println(mp);
		System.out.println(mp.hashCode());
		System.out.println(std_1.hashCode());
		System.out.println(std_4.hashCode());
		System.out.println(std_3.hashCode());
		System.out.println();
		System.out.println(mp.entrySet());
		System.out.println();
		System.out.println(mp.keySet());
		System.out.println();
		System.out.println(mp.get(std_1));
		
		
		
	}

}
