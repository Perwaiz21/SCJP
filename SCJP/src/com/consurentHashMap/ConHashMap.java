package com.consurentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConHashMap {

	public static void main(String[] args) {

		ConcurrentHashMap cpm = new ConcurrentHashMap();
		
		cpm.put("Abc", 1);
		cpm.put("Abcd", 2);
		cpm.put("Abcde", 3);
		cpm.put("Abcdef", 4);
		
		System.out.println(cpm);
		
	}
	

}
