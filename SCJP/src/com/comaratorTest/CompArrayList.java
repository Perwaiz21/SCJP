package com.comaratorTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CompArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(14);
		arrList.add(15);
		arrList.add(12);
		arrList.add(13);
		System.out.println(arrList);
		//Collections.sort(arrList);
		
		Comparator<Integer> com = new ComparatorTest();
		Collections.sort(arrList,com);
		System.out.println(arrList);
		
	}	

}
