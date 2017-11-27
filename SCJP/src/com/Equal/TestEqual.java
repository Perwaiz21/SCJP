package com.Equal;

public class TestEqual {

	public static void main(String[] args) {

		Person p = new Person();
		Person q = new Person();
		
		p.name = null;
		q.name = null;
		
		if (p.equals(q)){
						
			System.out.println("They are equal");
		}
		else{
			System.out.println("They are not equal");
		}
		System.out.println(q.name);
	}

}
