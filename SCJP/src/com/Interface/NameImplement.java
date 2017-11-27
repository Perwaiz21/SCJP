package com.Interface;

public class NameImplement implements Name, Name_2 {

	@Override
	public void show() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		NameImplement nameImp = new NameImplement();
		nameImp.show();
		
	}

}
