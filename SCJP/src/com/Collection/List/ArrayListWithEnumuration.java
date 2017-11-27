package com.Collection.List;

import java.util.*;

public class ArrayListWithEnumuration {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(4);
		list.add("String");
		list.add("Amit");
		list.add(17);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Object ele = itr.next();
			System.out.println(ele);
		}
				
		
	}

}
