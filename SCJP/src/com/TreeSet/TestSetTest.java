package com.TreeSet;

import java.util.TreeMap;
import java.util.TreeSet;

public class TestSetTest {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Ali");
		ts.add("Bubai");
		ts.add("Tushar");
		ts.add("Kunal");
		
		System.out.println(ts);
		
		TreeMap<String, Integer> mp = new TreeMap<String, Integer>();
		mp.put("d", 17);
		mp.put("b", 3);
		mp.put("a", 2);
		mp.put("c", 11);
		
		System.out.println(mp);
		
	}

}
