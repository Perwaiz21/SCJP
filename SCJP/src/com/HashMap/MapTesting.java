package com.HashMap;

import java.util.HashMap;

public class MapTesting {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Ali", 1000);
		hm.put("Perwaiz", 2000);
		hm.put("Babu", 3000);
		hm.put(null, 4000);
		hm.put("Ali", 5000);
		hm.put(null, 6000);
		System.out.println(hm);
	}
}
