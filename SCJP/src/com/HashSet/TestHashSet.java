package com.HashSet;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {

		Set set = new HashSet();
		set.add("Ali");
		set.add("Puneet");
		set.add("Ali");
		set.add("Puneet");
		set.add("Kunal");
		set.add("kamal");
		set.add("Puneet");
		set.add("Kunal");
		set.add(null);
		set.add("Perwaiz");
		set.add(null);
		System.out.println(set);
		System.out.println();
		System.out.println(set.size());
		
	}

}
