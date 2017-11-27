package com.Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoPersonAgain {

	public static void main(String[] args) {

		PersonAgain psg1 = new PersonAgain("Perwaiz","Ali",28);
		PersonAgain psg2 = new PersonAgain("Ravi","KG",31);
		PersonAgain psg3 = new PersonAgain("Paritosh","Singh",30);
		
		String s1 = "JOB";
		String s2 = "JOB";
		
		System.out.println(s1.equals(s2));
		System.out.println(psg1.equals(psg2));
		System.out.println(psg1==psg2);
		
		List list = new ArrayList();
		list.add(psg1);
		list.add(psg2);
		list.add(psg3);
		//Collections.sort(list);
		System.out.println(list);
		
		
	}

}
