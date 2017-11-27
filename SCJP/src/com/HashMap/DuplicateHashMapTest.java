package com.HashMap;

import java.util.HashMap;

public class DuplicateHashMapTest {

	public static void main(String[] args) {

		HashMap mp = new HashMap();
		mp.put("Ali",1);
		mp.put("Anil",2);
		mp.put("Ali",1);
		
		System.out.println(mp);
		System.out.println(mp.size());
		
		
	}

}
