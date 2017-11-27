package com.HashMap;

import java.util.HashMap;
import java.util.Iterator;


public class DemoPerson {
	
	public static void main(String arg[]){
		
		HashMap<Person, Integer> mp = new HashMap<Person, Integer>();
		Person p1 = new Person(100,"Ali");
		Person p2 = new Person(101,"Amit");
		Person p3 = new Person(102,"Anil");
		Person p4 = new Person(103,"Abhilash");
		Person p5 = new Person(100,"Ali");
		
		mp.put(p1, 20000);
		mp.put(p2, 40000);
		mp.put(p3, 60000);
		mp.put(p4, 80000);
		mp.put(p5, 20000);
		
		/*Set hs = new HashSet();
		
		hs = mp.keySet();*/
		System.out.println(mp.keySet());
		System.out.println(mp);
		System.out.println(mp.get(p3));
		//System.out.println(hs.toString());
		System.out.println(mp.size());
		
		
	}

}
