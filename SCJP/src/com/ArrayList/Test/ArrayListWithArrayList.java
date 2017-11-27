package com.ArrayList.Test;

import java.util.ArrayList;
import java.util.List;

interface pancake{
	List<String> doStuff(List<String> s);
}


public class ArrayListWithArrayList implements pancake{

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		ls.add("X");
		ls.add("Y");
		ls.add("Z");
		ArrayListWithArrayList alsl = new ArrayListWithArrayList();
		alsl.doStuff(ls);
	
		System.out.println(ls);
	}

	public List<String> doStuff(List<String> s){
		List list = s;
		list.add("10");
		return list;
	}
	}
