package com.HashMap;

import java.util.HashMap;

public class KeyDemo {
	
	public static void main(String args[])
	{
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("Ram ", 1000);
		mp.put("Ramu ", 1001);
		mp.put("Ramesh ", 1002);
		
		System.out.println(mp.keySet());
		System.out.println(mp);
		System.out.println(mp.entrySet());
	}
	

}
