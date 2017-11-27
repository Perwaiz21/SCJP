package com.Clone;

public class CloneTest {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) {

		Student st2 = null;
		Student st = new Student(3);
		
		st.i =11;
		System.out.println(st.i);
		try {
			st2 =(Student) st.clone();
			st2.i = 12;
			System.out.println(st2.i);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(st.i);
		System.out.println(st2.i);
		
	}

}
