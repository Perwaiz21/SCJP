package com.Duplicate;

public class DemoTestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ali","SSE",62000);
		Employee e2 = new Employee("Paritosh","SDE",100000);
		Employee e3 = new Employee("Ali","SSE",62000);
		Employee e4 = e1;
		
		/*System.out.println(e1==e3);
		System.out.println(e1.equals(e3));
		
		System.out.println(e1==e4);
		System.out.println(e1.equals(e4));*/
		
		System.out.println(e1.equals(e3));

	}

}
